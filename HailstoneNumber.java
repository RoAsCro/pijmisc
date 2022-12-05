import java.util.*;
public class HailstoneNumber {

	public static void main(String args[]) {
		System.out.print(hailstoneInit(3));
	}
	
	public static List<Integer> hailstoneInit(int n) {
		List<Integer> list = new ArrayList<>();
		hailstone(n, list);
		return list;
	}
	
	public static List<Integer> hailstone(int n, List<Integer> list) {
		
		list.add(n);
		if (n == 1) {
			return list;
		}
		
		int next;
		
		if (n % 2 == 0) {
			next = n/2;	
		}
		else 
			next = n * 3 + 1;
		return hailstone(next, list);
		
	}
	
}
