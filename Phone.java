
public class Phone {
	private String brand;
	private String callHistory;
	
	public Phone(String x, String y) {
		brand = x;
		callHistory = y;
	}
	
	public boolean equals(Object object) {
		if (object.getClass() == getClass()) {
			Phone phone = (Phone) object;
			if (phone.brand == brand && phone.callHistory == callHistory) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		int output = brand.hashCode() * 7 * callHistory.hashCode();
		
		return output;
	}
	
}
