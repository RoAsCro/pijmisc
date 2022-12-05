public class Reverse {
// Put your code here
	public static void main(String[] args) {
		String word = "abcdefg";
		System.out.println("Word: " + word);
		System.out.println("Word reversed: " + reverse(word));
		printNumbers(6);
		System.out.println(palindrome("abba"));
		System.out.println(palindrome("baaabaaa"));
		System.out.println(palindrome("wasitacatisaw"));
		System.out.println(power(2, 4));
		System.out.println(power(2, -4));
		System.out.println(factorial(7));
		System.out.println(factorial(5));
		System.out.println(factorial(0));
		System.out.println(iterFactorial(7));
		System.out.println(iterFactorial(5));
		System.out.println(iterFactorial(0));
		for (int i = 0; i < 5; i++) {
			System.out.println(paperIter("A" + i));
		}
		System.out.println(paperIter("A0"));
		System.out.println(paperIter("A00"));
		//overflow(1);
		
		
		
	}
	
	public static String reverse(String string) {
		if (string.length() == 1) {
			return string;
		}
		
		else {
			return  reverse(string.substring(1)) + string.charAt(0);
		}
		
	}
	
	public static boolean palindrome(String string) {
		if (reverse(string).equals(string)) return true;
		return false;
	}
	
	public static double power(int base, int exponent) {
		if (exponent == 0) return 1;
		if (exponent > 0) return base * power(base, exponent - 1);
		else return power(base, exponent + 1) / base;
	}
	
	public static int factorial(int n) {
		if (n <= 1) return 1;
		else return n * factorial(n - 1);
	}
	
	public static int iterFactorial(int n) {
		int answer = 1;
		while (n > 1) {
			answer *= n;
			n--;
		}
		return answer;
	}
	
	public static int fibbonacci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		else return fibbonacci(n - 1) + fibbonacci(n - 2);
		
	}
	
	public static int iterFibbonacci(int n) {
		int answer = 0, prevAnswer = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i == 1) answer++;
			else {
				answer += prevAnswer;
				prevAnswer = answer - prevAnswer;
			}
			
		}
		
		return answer;
	}
	
	public static String paperIter(String size) {
		String number = size.substring(1);
		int sizeCode = Integer.parseInt(number);
		if (sizeCode == 0) sizeCode = -number.length() + 1;
		int length = 1189, breadth = 841;
		if (sizeCode >= 0) {
			for (int i = sizeCode; i != 0; i--) {
				int store = breadth;
				breadth = length / 2;
				length = store;
				
				
			}
		}
		
		else {
			for (int i = sizeCode; i != 0; i++) {
				int store = length;
				length = breadth * 2;
				breadth = store;
			}
		
		}
		
		return breadth + "mm X " + length + "mm";
	}
	

	public static int overflow(int n) {
		System.out.println(n);
		return 88 + overflow(n+1);
	}
	
	
	public static void printNumbers(int n) {
		if (n <= 0) {
		return;
		}
		System.out.println(n);
		printNumbers(n-2);
		printNumbers(n-3);
		System.out.println(n);
		}
	
}