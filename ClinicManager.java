import java.util.*;
import java.io.*;

public class ClinicManager{
	
	File file = new File(".");
	
	public static void main(String[] args) {
		ClinicManager man = new ClinicManager();
		man.run();
	}
	
	public void run() {
		
		Thread newThread = new Thread();
		newThread.start();
//		
//		System.out.println(file.isDirectory());
//		System.out.println(Arrays.toString(file.list()));
//		String filename = "./filename.txt";
//		File filed = new File("./filename.txt");
//		BufferedReader in = null;
//		try {
//			in = new BufferedReader(new FileReader(filed));
//			String line;
//			while ((line = in.readLine()) != null) {
//				System.out.println(line);
//			}
//			in.close();
//		} catch (FileNotFoundException ex) {
//			throw new RuntimeException(ex);
//		} catch(IOException ex) {
//			throw new RuntimeException(ex);
//		} finally {
//			try {
//				if (in != null) {
//					in.close();
//				}
//			} catch (IOException ex) {
//				throw new RuntimeException(ex);
//			}
//		}
//		
//		PrintWriter out = null;
//		
//		try {
//			out = new PrintWriter(filed);
//			out.append("d");
//		} catch (FileNotFoundException ex) {
//			throw new RuntimeException(ex);
//		} finally {
//			out.close();
//		}
//		
//		newFileIter();
//		
//		//File file = new File("./" + System.console().readLine());
//		//file.mkdir();
////		
////		List<String> myList = new ArrayList<>();
////		myList.add("Hellow");
////		String s = myList.get(0);
////		System.out.println(s);
////		
////		Set<String> patients = new HashSet<String>();
////		String[] list = {"Java", "C", "PHP", "JavaScript", "Python", "Rust", "Haskell", "Go", "Prolog"};
////		for (int i = 0; i< list.length; i++) {
////			patients.add(list[i]);
////		}
////		/*Iterator iter =  patients.iterator();
////		while (iter.hasNext()) {
////			System.out.println(iter.next());
////		}*/
////		System.out.println(patients.hashCode());
////		for (String x : patients) {
////			System.out.println(x);
////			//System.out.println(x.hashCode());
////		}
////		
////		Set<String> linked = new LinkedHashSet<String>();
////		for (int i = 0; i< list.length; i++) {
////			linked.add(list[i]);
////		}
////		for (String x : linked) {
////			System.out.println(x);
////			//System.out.println(x.hashCode());
////		}
////		
////		Set<String> tree = new TreeSet<>();
////		for (int i = 0; i< list.length; i++) {
////			tree.add(list[i]);
////		}
////		for (String x : tree) {
////			System.out.println(x);
////			//System.out.println(x.hashCode());
////		}
////		
////		Phone phone = new Phone("A", "B");
////		Phone phone2 = new Phone("B", "B");
////		Phone phone3 = new Phone("A", "B");
////		System.out.println(phone.equals(phone2));
////		System.out.println(phone.equals(phone3));
////		Set<Phone> phoneHash = new HashSet<>();
////		phoneHash.add(phone3);
////		phoneHash.add(phone);
////		phoneHash.add(phone2);
////		System.out.println(phoneHash.contains(phone));
////		/*for (Phone x : phoneHash) {
////			System.out.println(x);
////			System.out.println(x.hashCode());
////			//System.out.println(x.hashCode());
////		}
////		
////		System.out.println(doSomething(new ArrayList<Dog>()));
////		*/
//		
//		
//		
//		int input;
//		while (1==1) {
//			System.out.println("Pls");
//			String userInput = System.console().readLine();
//			
//			if (testInput(userInput)) {
//				System.out.println("Weee");
//				break;
//			}
//		}
//		for (int i = 0; i < 4; i++) {
//			String userInput;
//			System.out.println("Pls enter num");
//			userInput = System.console().readLine();
//			if (testInput(userInput)) {
//				i--;
//				input = Integer.parseInt(userInput);		
//			}
//		}
//		
//		ArrayList<Patient> array = new ArrayList<>(); 
//		
//		Patient patient = new Patient(2005);
//		array.add(patient);
//		
//		PrimeDivisorList list = new PrimeDivisorList();
//		list.add(1);
//		System.out.println(list.get(0));
//		
	}
	
	
	public boolean testInput(String userInput) throws NumberFormatException {
		try {
			Integer.parseInt(userInput);
		} catch (NumberFormatException ex) {
			throw new RuntimeException(ex);
			//return false;
		}
		return true;
	}
	
	public void newFileIter() {
		ArrayList<String> list = new ArrayList<>();
		String input = "x";
		while (!input.isBlank()) {
			input = System.console().readLine();
			list.add(input);
		}
		for (int i = 0; i < list.size()-1 ; i++) {
			newFile(list.get(i));
		}
	}
	
	public void newFile(String fileName) {
		File file = new File("./" + fileName);
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			 
		} catch (FileNotFoundException ex) {
			System.out.println("File " + fileName+  " not found");
		} catch (IOException ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
		
	}
	
	public static Animal doSomething(List<? extends Animal> animals) {
		//animals.add(new Animal());
		//animals.add( new Dog());
		return animals.get(1);
		}

	
}