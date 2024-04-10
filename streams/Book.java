package streams;

public class Book {
	private String title;
	private Author author;
	
	public Book(String title, Author author) {
		this.title = title;
		this.author = author;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Titulo:[" + title + "] " + author;
	}
	
	

}
