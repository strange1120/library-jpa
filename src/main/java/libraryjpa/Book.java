package libraryjpa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue
	private Long id;
	private String title;

	@ManyToOne
	private Genre genre;

	@ManyToMany
	private Set<Author> authors;

	protected Book() {

	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Genre getGenre() {
		return genre;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public Book(String title, Genre genre, Author... author) {
		this.title = title;
		this.genre = genre;
		this.authors = new HashSet<Author>(Arrays.asList(author));
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", genre=" + genre + ", authors=" + authors + "]";
	}

}
