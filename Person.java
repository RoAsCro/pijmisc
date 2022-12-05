
public class Person {
	private String fullName;
	
	public static void main(String[] args) {
		Person p = new Person("Bob Bo b B o b");
		System.out.println(p.getInitials());
	}
	
	public Person(String fullName) {
		this.fullName = fullName;
	}
	public String getInitials() {
		String result = "";
		String[] words = fullName.split(" ");
		for (int i = 0; i < words.length; i++) {
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase();
		}
		return result;
	}
}
