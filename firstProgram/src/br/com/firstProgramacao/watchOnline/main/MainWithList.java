package br.com.firstProgramacao.watchOnline.main;

import br.com.firstProgramacao.watchOnline.models.Movie;
import br.com.firstProgramacao.watchOnline.models.Title;
import br.com.firstProgramacao.watchOnline.models.TvSeries;

import java.util.ArrayList;

public class MainWithList {
    public static void main(String[] args) {
        // Reference type
        Movie movieInfo = new Movie("Interstellar", 2014);

        Movie movie = new Movie("Bot",2008);

        TvSeries series = new TvSeries("It's Ok Not Be Okay", 2020);

        ArrayList<Title> listPrograms = new ArrayList<>();
        listPrograms.add(movieInfo);
        listPrograms.add(movie);
        listPrograms.add(series);

        // FOREACH
        for (Title title: listPrograms){
            System.out.println(title.getName());
            Movie movieTwo = (Movie) title;
            System.out.println(movieTwo.getClassification());
        }
        
    }
}
