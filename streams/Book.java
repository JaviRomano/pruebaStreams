package streams;

public class Book {
	private String title;
	private Author author;
	
	public Book(String name, Author author) {
		this.title = name;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}
	
}
