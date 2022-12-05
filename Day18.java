
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Day18 {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https", "//api.postcodes.io/postcodes/se109dj", null))
                .GET()
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(getRequest, BodyHandlers.ofString());
        int status  = response.statusCode();
        if (status == 200)
        	System.out.println(response.body());
        else System.out.println(status);
        Gson gson = new Gson();
        PostcodeResponse pr = gson.fromJson(response.body(), PostcodeResponse.class);
        System.out.println(pr.toString());
        
        HttpRequest getNewRequest = HttpRequest.newBuilder()
                .uri(new URI("https", "//api.postcodes.io/postcodes/", null))
                .POST(HttpRequest.BodyPublishers.ofString("{\"postcodes\" : [\"SE109DJ\", \"SW151DQ\"]}"))
                .build();
        httpClient = HttpClient.newHttpClient();
        response = httpClient.send(getNewRequest, BodyHandlers.ofString());
        pr = gson.fromJson(response.body(), PostcodeResponse.class);
        System.out.println(response.body());
//        Gson gson = new Gson();
//        CatFact catFact = gson.fromJson(response.body(), CatFact.class);
//
//        System.out.println(catFact)
	}
}
