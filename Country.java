import java.util.*;
public class Country {
	final static int NUMBER = 7;
	static City[] cities = new City[NUMBER];
	//static double[][] distances = new double[NUMBER][NUMBER];
	static TreeSet<Distance> distances = new TreeSet<>();
	static int counter =0;
	
	public static void main(String args[]) {
		for (int i = 0; i < NUMBER; i++) {
			City city = new City();
			cities[i] = city;
		}
		for (int i = 0; i < NUMBER; i++) {
			for (int j = 1 + i; j < NUMBER; j++) {
				Distance distance = new Distance(cities[i], cities[j]);
				distances.add(distance);
				counter++;
			}
		}
		
		for (Distance d : distances) {
			System.out.println(d.distance);
		}
		
		LinkedList<City> moreCities = new LinkedList<>();
		LinkedList<Distance> moreDistances = new LinkedList<>();
		
		for (Distance d : distances) {
			boolean add = true;
			for (City c : moreCities) {
				if (d.cityOne == c || d.cityTwo == c) {
					add = false;
					break;		
				}
			}
			
			if (add) {
				moreCities.add(d.cityOne);
				moreCities.add(d.cityTwo);
				moreDistances.add(d);
			}
			if (moreDistances.size() == distances.size() - NUMBER) {
				
			}
		}
		
		System.out.println("------------------------------");
		
		for (Distance d : moreDistances) {
			System.out.println(d.distance);
		}
		
		for (Distance d : moreDistances) {
			distances.remove(d);
		}
		
		System.out.println("------------------------------");
		
		for (Distance d : distances) {
			System.out.println(d.distance);
		}
		
	}
	
}
