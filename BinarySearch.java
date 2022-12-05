import java.util.*;
public class BinarySearch {

	public static void main(String args[]) {
//		List<Integer> list = new ArrayList<>();
//		for (int i = 0; i < 10000; i++) {
//			list.add(i);
//		}
//		System.out.println("v");
//		System.out.println(search(1, 0, list.size() - 1, list));
		System.out.println(anagramInit("ar"));
//		
	}
	
	
	public static boolean search(int n, int min, int max, List<Integer> list) {
		System.out.println("Max = " + max +  " Min = " + min);
		int middle = max - ((max - min) / 2);
		int middleNumber = list.get(middle);
		//System.out.println(middle);
		if (max == middle && middleNumber != n) return false;
		
		if (middleNumber == n) {
			return true;
		}
		if (n < middleNumber) {
			//System.out.println("A");
			return search(n, min, middle, list);
		}
		
		else
			return search(n, middle, max, list);
	}
	
	public static boolean anagramInit(String word) {
		List<String> list = new ArrayList<>();
		anagram(word, "", list);
		System.out.print(list);
		return false;
	}
	
	public static void anagram(String word, String newWord, List<String> list) {
		
		char[] chars = word.toCharArray();
		//newWord += word.charAt(0);
		for (char c : chars) {
			String newestWord = newWord + c;
			//System.out.println(word + " " +  c);
			if (word.length() == 1) {
				list.add(newestWord);
				break;
			}
			anagram(word.replaceFirst(c+"", "") , newestWord, list);
			
		}
		//if (word.length() == 1) return word;
		//System.out.println(list.toString());
		//return newWord; //+ anagram(word.substring(1));
		
	}
	
	public static List<Integer> mergesort(List<Integer> list) {
		
		if (list.size() <= 1) {
			return list;
		}
		else {
			ArrayList<Integer> newList;
			return
					newList = new ArrayList<>(mergesort(list));
		}
		
		//return list;
	}
	
	
}
