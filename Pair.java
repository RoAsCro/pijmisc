
public class Pair<T, U> {
	private T elemOne;
	private U elemTwo;
	
	public static void main(String[] args) {
		Pair<Number, String> pair = new Pair<>(1, "ASDAS");
		pair.run();
	
	}
	
	public void run() {
		System.out.println(getOne());
		System.out.println(getTwo());
		Pair<T, U> clone = new Pair<>(this);
		System.out.println(clone.getOne());
		System.out.println(clone.getTwo());
		Pair<U, T> swapped = swap();
		System.out.println(swapped.getOne());
		System.out.println(swapped.getTwo());
		
	}
	
	
	public Pair(T one, U two) {
		elemOne = one;
		elemTwo = two;
	}

	
	public Pair(Pair<? extends T, ? extends U> pair) {
		//T one = pair.elemOne;
		this((T) pair.elemOne, (U) pair.elemTwo);
	}
	
	public T getOne() {
		return elemOne;
	}
	
	public U getTwo() {
		return elemTwo;
	}
	
	public Pair<U, T> swap() {
		return new Pair<U, T>(elemTwo, elemOne);
	}


	
}
