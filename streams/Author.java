package streams;

public class Author {
	private int age;
	private String surname;
	private Gender gender;
	
	public Author(int age, String surname, Gender gender) {
		this.age = age;
		this.surname = surname;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public String getSurname() {
		return surname;
	}

	public Gender getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return " - " + surname + " - edad: " + age + ".";
	}
	
	
}
