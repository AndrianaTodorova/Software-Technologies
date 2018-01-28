using System.Linq;
using System.Net;
using System.Web.Mvc;
using IMDB.Models;

namespace IMDB.Controllers
{
    [ValidateInput(false)]
    public class FilmController : Controller
    {
        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            using(var db = new IMDBDbContext())
            {
                var films = db.Films.ToList()
                    .OrderBy(a => a.Name)
                    .ThenBy(a => a.Year)
                    .ToList();

                return View(films);
            }
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Film film)
        {
            if (ModelState.IsValid)
            {
                using(var db = new IMDBDbContext())
                {
                    db.Films.Add(film);
                    db.SaveChanges();

                    return RedirectToAction("Index");
                }
            }
            return View(film);
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int? id)
        {
            using (var db = new IMDBDbContext())
            {
                var film = db.Films.FirstOrDefault(p => p.Id == id);
                if (film == null)
                {
                    return RedirectToAction("Index");
                }
                return View(film);
            }
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int? id, Film filmModel)
        {
            using (var db = new IMDBDbContext())
            {
                var film = db.Films.FirstOrDefault(p => p.Id == id);

                if (film == null)
                {
                    return RedirectToAction("Index");
                }
                if (ModelState.IsValid)
                {
                    film.Name = filmModel.Name;
                    film.Genre = filmModel.Genre;
                    film.Director = filmModel.Director;
                    film.Year = filmModel.Year;

                    db.SaveChanges();

                    return RedirectToAction("Index");
                }
                return View("Edit", filmModel);
            }
        }

        [HttpGet]
        [Route("delete/{id}")]
        public ActionResult Delete(int? id)
        {
            using (var db = new IMDBDbContext())
            {
                var film = db.Films.Find(id);
                if (film != null)
                {
                    return View(film);
                }
            }
            return RedirectToAction("Index");
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirm(int? id, Film filmModel)
        {
            using (var db = new IMDBDbContext())
            {
                var film = db.Films.Find(id);
                if (film != null)
                {
                    db.Films.Remove(film);
                    db.SaveChanges();
                }
            }
            return RedirectToAction("Index");
        }
    }
}