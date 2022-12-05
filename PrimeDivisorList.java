import java.util.*;
public class PrimeDivisorList extends ArrayList <Integer> {
	
	/**
	 * 
	 */
	public PrimeDivisorList() {
		super();
	}

	public boolean add(Integer number) {
		if (number == null) {
			throw new NullPointerException();
		}
		super.add(number);
		return true;
	}
}
