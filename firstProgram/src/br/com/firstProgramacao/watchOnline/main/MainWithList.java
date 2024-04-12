package br.com.firstProgramacao.watchOnline.main;

import br.com.firstProgramacao.watchOnline.models.Movie;
import br.com.firstProgramacao.watchOnline.models.Title;
import br.com.firstProgramacao.watchOnline.models.TvSeries;

import java.util.ArrayList;
import java.util.Collections;

public class MainWithList {
    public static void main(String[] args) {
        // Reference type
        Movie movieInfo = new Movie("Interstellar", 2014);
        movieInfo.evaluationMovie(7);
        movieInfo.evaluationMovie(9);

        Movie movie = new Movie("Bot",2008);
        movie.evaluationMovie(2);
        movie.evaluationMovie(9);

        // ESTÁ SE REFERENCIANDOO AO MESMO OBJETO, ASSUNTO DE PONTEIROS
        // POIS NEM DEU UM NEW
        Movie bot = movie;

        TvSeries series = new TvSeries("It's Ok Not Be Okay", 2020);

        ArrayList<Title> listPrograms = new ArrayList<>();
        listPrograms.add(movieInfo);
        listPrograms.add(movie);
        listPrograms.add(series);

        // FOREACH
        for (Title title: listPrograms){
            System.out.println(title.getName());

            // FORMA QUE POSSO ENCONTRAR EM ALGUNS CÓDIGOS LEGADOS
            if (title instanceof Movie movieTwo){
//                Movie movieTwo = (Movie) title;
                System.out.println(movieTwo.getClassification());
            }
//            Movie movieTwo = (Movie) title;
        }

        //ORDENAÇÃO
        ArrayList<String> findArtists = new ArrayList<>();
        findArtists.add("Optimus Prime");
        findArtists.add("Bumblebee");
        findArtists.add("Mirage");
        System.out.println(findArtists);

//        Collections.sort(findArtists);
//        System.out.println(findArtists);
        listPrograms.add(movieInfo);
        listPrograms.add(movie);
        listPrograms.add(series);
        Collections.sort(listPrograms);
        System.out.println(listPrograms);
    }
}
