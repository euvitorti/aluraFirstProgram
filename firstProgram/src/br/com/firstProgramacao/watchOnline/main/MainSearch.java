    package br.com.firstProgramacao.watchOnline.main;

import br.com.firstProgramacao.watchOnline.exception.InvalidYearException;
import br.com.firstProgramacao.watchOnline.models.OmdbTitle;
import br.com.firstProgramacao.watchOnline.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        List<Title> titleList =  new ArrayList<>();

        String search = "";

        // AQUI ESTÁ PEGANDO O PARÃO DE NOMENCÇATURA
        // O JSON VEM EM UPPERCASE
        // E VAI SE RESPONSABILIZAR POR IGNORAR
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!search.equalsIgnoreCase("exit")) {

            System.out.println("Movie or series name: ");
            search = scanner.nextLine();

            if (search.equalsIgnoreCase("exit")) {
                break;
            }

            String address = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=cea70f0f";

            try {
                // Para fazer a requisição (GET)
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();

                // RECEBENDO A RESPOSTA
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                OmdbTitle omdbTitle = gson.fromJson(json, OmdbTitle.class);

                Title title = new Title(omdbTitle);
                System.out.println(title);

                titleList.add(title);

//                // ESCREVENDO EM UM ARQUIVO OS FILMES QUE FORAM PESQUISADOS
//                FileWriter fileWriter = new FileWriter("movie.txt");
//                fileWriter.write(title.toString());
//                fileWriter.close();
            } catch (NumberFormatException e) {

                System.out.println("ERROR");
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("I ALA ESCREVEU ERRADO");
            } catch (InvalidYearException e) {
                System.out.println(e.getMessage());
            }
        }

        FileWriter fileWriter = new FileWriter("movies.json");
        fileWriter.write(gson.toJson(titleList));
        fileWriter.close();

    }
}
