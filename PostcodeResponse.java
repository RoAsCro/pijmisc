
public class PostcodeResponse {
	private int status;
	private Result result;

//	public PostcodeResponse() {
//		
//	}
	
	@Override
	public String toString() {
		return
				"Status: " + status +
				"\nPostcode: " + result.postcode +
				"\nRegion: " + result.region +
				"\nLongitude: " + result.longitude +
				"\nLatitude: " + result.latitude ;
	}
	
	public  class Result {
		String postcode;
		String region;
		double longitude;
		double latitude;
	}
	
	
}
