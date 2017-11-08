package libraryjpa;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue
	private Long id;

	private String firstName;
	private String lastName;

	@ManyToMany(mappedBy = "authors")
	private Set<Book> bookList;

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Set<Book> getBookList() {
		return bookList;
	}

	// public void setBookList(Book... book) {
	// this.bookList = new HashSet<Book>(Arrays.asList(book));
	// }

	protected Author() {

	}

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + bookList.size() + "]";
	}

}
