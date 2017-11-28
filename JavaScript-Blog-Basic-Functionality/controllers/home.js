const Article = require('mongoose').model('Article');

module.exports = {
  index: (req, res) => {
      Article.find({}).limit(6).populate('author').then(articles => {
         //  console.log(articles[0].author)
         // console.log(req.user)
         // console.log(articles)
         //
         //  if (req.user) {
         //      let result = articles.filter(a => {
         //          console.log(a.author._id)
         //          console.log(req.user._id)
         //
         //          return a.author._id === req.user._id
         //      })
         //
         //      res.render('home/index', {articles: result});
         //      return
         //  }
         //  console.log(articles)
          res.render('home/index', {articles: articles});
      })
  }

};