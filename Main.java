import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main x = new Main();
		x.run();
	}

	


	public void run(){
		String[] array = new String[] {"a", "b","c" , "d", "e", "f"};
//		array[2] = null;
//		System.out.println(array[2]);
//		List<String> list = Arrays.asList(array);
//		ArrayList<String> list2 = new ArrayList<>(list);
//		list2.remove(2);
//		System.out.println(list2.get(2));
		ArrayList<String> listy = new ArrayList<>();
		char c = 'a';
		for (int i = 0; i< 5; i++) {
			listy.add("" + (c+i));
		}
		System.out.println( listy.toString());
		listy.remove(3);
		System.out.println( listy.toString());
		
		
//		ArrayStack<Integer> myNumberStack = new ArrayStack<Integer>();
//		myNumberStack.push(1);
//		ArrayStack<String> myStringStack = new ArrayStack<String>();
	//myStringStack.push("Test string!");
	}
}
