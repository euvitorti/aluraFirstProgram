package br.com.firstProgramacao.watchOnline.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;


public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Para fazer a requisição (GET)
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?paramsx&apikey=YourKey"))
                .build();

        // RECEBENDO A RESPOSTA
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
