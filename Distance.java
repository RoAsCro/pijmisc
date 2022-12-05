
public class Distance implements Comparable {
	City cityOne;
	City cityTwo;
	double distance;
	
	public Distance(City one, City two) {
		cityOne = one;
		cityTwo = two;
		distance = one.distanceToCity(two);
	}

	@Override
	public int compareTo(Object o) {
		Distance d = (Distance) o;
		if (d.distance < this.distance) {
			return -1;
		} else if (d.distance > this.distance) {
			return 1;
		} else return 0;
	}
	
}
