package br.com.firstProgramacao.watchOnline.main;

import br.com.firstProgramacao.watchOnline.models.Title;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Movie or series name: ");
        String search = scanner.nextLine();

        String address = "https://www.omdbapi.com/?t=" + search + "&apikey=cea70f0f";

        // Para fazer a requisição (GET)
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        // RECEBENDO A RESPOSTA
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
//        System.out.println(json);

        Gson gson = new Gson();
        Title title = gson.fromJson(json, Title.class);
        System.out.println(title);
    }
}
