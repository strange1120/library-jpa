package libraryjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

	// @OneToMany
	// private Book books;

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
