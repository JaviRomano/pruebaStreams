package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {

		List<Author> authors = new ArrayList<>();
		authors.add(new Author(27, "Machado", Gender.MALE));
		authors.add(new Author(47, "De Castro", Gender.FEMALE));
		authors.add(new Author(32, "Cervantes", Gender.MALE));
		authors.add(new Author(50, "Bukowski", Gender.MALE));
		authors.add(new Author(18, "Belen Esteban", Gender.FEMALE));
		authors.add(new Author(99, "Tolkien", Gender.MALE));
				
		List<Book> library = new ArrayList<>();
		library.add(new Book("Libro 1", authors.get(0)));
		library.add(new Book("Libro 2", authors.get(1)));
		library.add(new Book("Libro 3", authors.get(2)));
		library.add(new Book("Libro 4", authors.get(2)));
		library.add(new Book("Libro 5", authors.get(0)));
		library.add(new Book("Libro 6", authors.get(1)));
		library.add(new Book("Libro 7", authors.get(0)));
		library.add(new Book("Libro 8", authors.get(1)));
		library.add(new Book("Libro 9", authors.get(0)));
		
		Stream<Book> s1 = library.stream().filter(s -> false);
		Stream<Book> s2 = library.stream();
		
		library
				.stream()
				.filter(b -> b.getAuthor().getGender() == Gender.MALE)
				.map(b -> b.getTitle())
				.sorted((s10, s20) -> - s10.length() + s20.length())
				.forEach(s -> System.out.println(s));
	}
}
