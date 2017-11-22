const Article = require('mongoose').model('Article');

module.exports = {
    createGet: (req, res) => {
        res.render('article/create');
    },

    createPost: (req, res) => {
        let articleArgs = req.body;
        let errorMasg = '';

        if (!req.isAuthenticated()) {
            errorMasg = 'You should be logged in to make articles!'
        }
        else if (!articleArgs.title) {
            errorMasg = 'Invalid title!';
        } else if (!articleArgs.content) {
            errorMasg = 'Invalid content';
        }

        if (errorMasg) {
            res.render('article/create', {error: errorMasg});
            return;
        }
        articleArgs.author = req.user.id;
        Article.create(articleArgs).then(article => {
            req.user.articles.push(article.id);
            req.user.save(err => {
                if (err) {
                    res.redirect('/', {error: err.message});
                } else {
                    res.redirect('/');
                }
            });
        })
    },

    details: (req, res) => {
        let id = req.params.id;

        Article.findById(id).populate('author').then(article => {
            res.render('article/details', article)
        });
    }

}