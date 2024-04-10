package streams;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
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
		library.add(new Book("Poesias", authors.get(0)));
		library.add(new Book("La vida de los gatos", authors.get(1)));
		library.add(new Book("Rinconete & Cortado", authors.get(2)));
		library.add(new Book("Entremeses", authors.get(2)));
		library.add(new Book("El puchero", authors.get(0)));
		library.add(new Book("La batalla de las lombrices", authors.get(1)));
		library.add(new Book("Ruleta: cambia tu suerte", authors.get(0)));
		library.add(new Book("yonkis&gitanos", authors.get(1)));
		library.add(new Book("Carne Machada", authors.get(0)));

	/*	library
				.stream()
				.filter(b -> b.getAuthor().getGender() == Gender.MALE)
				.map(b -> b.getTitle())
				.sorted((s1, s2) -> - s1.length() + s2.length())
				.forEach(s -> System.out.println(s));*/
						
		int suma = library.stream()
			.peek(b -> System.out.println(b.getTitle() + b.getAuthor()))
			.limit(10)
			.map(b -> b.getAuthor().getAge())
			.reduce(0, (n1, n2) -> n1 + n2);
		
		System.out.println(suma);
			
		
		
				
	/*	library
				.stream()
				.peek(b -> b.getAuthor().getSurname())
				.limit(5)
				.forEach(s -> System.out.println(s));*/
				

	}
}
