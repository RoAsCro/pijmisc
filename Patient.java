import java.time.Year;

public class Patient {
	private final int yearOfBirth;
	
	public Patient(int year) throws IllegalArgumentException {
		yearOfBirth = year;
		int age = Year.now().getValue() - yearOfBirth;
		if (age > 130  || age < 0) {
			throw new IllegalArgumentException();
		}
	}
}
