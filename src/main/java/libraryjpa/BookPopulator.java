package libraryjpa;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookPopulator implements CommandLineRunner {

	@Resource
	private BookRepository bookRepo;

	@Resource
	private AuthorRepository authorRepo;

	@Resource
	private GenreRepository genreRepo;

	@Override
	public void run(String... args) throws Exception {
		Genre fiction = new Genre("Fiction");
		genreRepo.save(fiction);
		Genre nonfiction = new Genre("Non-Fiction");
		genreRepo.save(nonfiction);
		Author kathy = new Author("Kathy", "Sierra");
		authorRepo.save(kathy);
		Author bert = new Author("Bert", "Bates");
		authorRepo.save(bert);
		Author elisabeth = new Author("Elisabeth", "Freeman");
		authorRepo.save(elisabeth);
		Author clifford = new Author("Clifford", "Stoll");
		authorRepo.save(clifford);
		Book book1 = new Book("Head First Design Patterns", nonfiction, kathy, bert);
		bookRepo.save(book1);
		Book book2 = new Book("Head First Java", nonfiction, kathy, elisabeth);
		bookRepo.save(book2);
		Book book3 = new Book("The Cukoo's Egg", fiction, clifford);
		bookRepo.save(book3);

		// kathy.setBookList(book1, book2);
		// bert.setBookList(book1);
		// elisabeth.setBookList(book2);
		// clifford.setBookList(book3);

		System.out.println(book1.getTitle());
		System.out.println(book1.getAuthors().size());

		System.out.println(book2.getTitle());
		System.out.println(book2.getAuthors().size());

		System.out.println(book3.getTitle());
		System.out.println(book3.getAuthors().size());

	}

}
