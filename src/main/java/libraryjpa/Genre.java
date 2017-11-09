package libraryjpa;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {

	@Id
	@GeneratedValue
	private Long id;
	private String genre;

	public Long getId() {
		return id;
	}

	public String getGenre() {
		return genre;
	}

	@OneToMany(mappedBy = "genre")
	private Set<Book> bookList;

	public Set<Book> getBookList() {
		return bookList;
	}

	protected Genre() {

	}

	public Genre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Genre [id=" + id + ", genre=" + genre + "]";
	}

}
