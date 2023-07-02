package au.com.telstra.simcardactivator.service;

import au.com.telstra.simcardactivator.payload.SimDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;
@Service
public class SimService {

    @Autowired
    private RestTemplate restTemplate;

    public String getStatus(SimDetails simDetails)
    {
        String iccid = simDetails.getIccid();

        HttpClient httpClient = HttpClient.newHttpClient();
        String url = "http://localhost:8444/actuate";
        String requestBody = "{\"iccid\":\"" + iccid + "\"}";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        try {
            // Send the POST request synchronously
            HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

            // Extract the response body

            // Process the response as needed
            return response.body();
            // ...
        } catch (Exception e) {
            // Handle any exceptions
            e.printStackTrace();
        }

        return null;

    }

}
