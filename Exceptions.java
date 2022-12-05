
public class Exceptions {
	int SURNAME_PREFIX_LENGTH = 5;
	
	public static void main(String[] args) {
		Exceptions exe = new Exceptions();
		exe.run();
	}
	
	public void run() {
		try {
			generateUsername('j', "doe");
		} catch (StringIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
			
	}
	
	public String generateUsername(char initial, String surname) throws StringIndexOutOfBoundsException {
		return initial + surname.substring(0, SURNAME_PREFIX_LENGTH);
		}
}
