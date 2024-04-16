package br.com.firstProgramacao.watchOnline.main;

import br.com.firstProgramacao.watchOnline.exception.InvalidYearException;
import br.com.firstProgramacao.watchOnline.models.OmdbTitle;
import br.com.firstProgramacao.watchOnline.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

        String address = "https://www.omdbapi.com/?t=" + search.replace(" ","+") + "&apikey=cea70f0f";

        try{
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

            // AQUI ESTÁ PEGANDO O PARÃO DE NOMENCÇATURA
            // O JSON VEM EM UPPERCASE
            // E VAI SE RESPONSABILIZAR POR IGNORAR
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            OmdbTitle omdbTitle = gson.fromJson(json, OmdbTitle.class);
//        System.out.println(omdbTitle);


            Title title = new Title(omdbTitle);
            System.out.println(title);
        } catch (NumberFormatException e) {

            System.out.println("ERROR");
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("I ALA ESCREVEU ERRADO");
        } catch (InvalidYearException e){
            System.out.println(e.getMessage());
        }
    }
}
