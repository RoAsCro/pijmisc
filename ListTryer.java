import java.util.*;
public class ListTryer {

	public static void main(String[] args) {
		

		LinkedList<String> list = new LinkedList<>();
		String[] array = list.toArray(new String[0]);
		if (array == null) System.out.println("A");
		else System.out.println("B");
		for (int i = 0 ; i < 10 ; i++) {
			list.add("" + i);
		}
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String next = iter.next();
			System.out.println(next);
			if (next.equals("3")) iter.remove();
		}
		
		String[] productArray = (String[]) list.toArray(new String[0]);
		System.out.print(productArray);
		
		while (iter.hasNext()) {
			String next = iter.next();
			System.out.println(next);
			if (next.equals("3")) iter.remove();
		}
		
	}
	
}
