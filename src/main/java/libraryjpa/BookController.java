package libraryjpa;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

	@Resource
	BookRepository bookRepo;

	@Resource
	AuthorRepository authorRepo;

	@Resource
	GenreRepository genreRepo;

	@RequestMapping("/genres")
	public String showAllGenres(Model model) {
		model.addAttribute("genres", genreRepo.findAll());
		return "genres";
	}

	@RequestMapping("/authors")
	public String showAllAuthors(Model model) {
		model.addAttribute("authors", authorRepo.findAll());
		return "authors";
	}

	@RequestMapping("/books")
	public String showAllBooks(Model model) {
		model.addAttribute("books", bookRepo.findAll());
		return "books";
	}

	@RequestMapping("/genre")
	public String showOneGenre(@RequestParam Long id, Model model) {
		model.addAttribute("genre", genreRepo.findOne(id));
		return "genre";

	}

	@RequestMapping("/author")
	public String showOneAuthor(@RequestParam Long id, Model model) {
		model.addAttribute("author", authorRepo.findOne(id));
		return "author";

	}

	@RequestMapping("/book")
	public String showOneBook(@RequestParam Long id, Model model) {
		model.addAttribute("book", bookRepo.findOne(id));
		return "book";
	}

}
