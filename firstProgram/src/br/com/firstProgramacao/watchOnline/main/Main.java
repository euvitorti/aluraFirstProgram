package br.com.firstProgramacao.watchOnline.main;

import br.com.firstProgramacao.watchOnline.models.Movie;
import br.com.firstProgramacao.watchOnline.models.TvSeries;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Reference type
        Movie movieInfo = new Movie("Interstellar", 2014);
        movieInfo.evaluationMovie(7);
        movieInfo.evaluationMovie(9);
//        movieInfo.name = "Interstellar";
        movieInfo.showMovieInfo();

        Movie movie = new Movie("Bot",2008);
        movie.evaluationMovie(2);
        movie.evaluationMovie(9);
//        movie.name = "Bot";
        movie.showMovieInfo();

        TvSeries series = new TvSeries("It's Ok Not Be Okay", 2020);
        series.setSeason(1);
        series.showMovieInfo();

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(movieInfo);
        movieList.add(movie);
        System.out.printf("Size: %d\n", movieList.size());
        System.out.printf("Name of the first movie: %s", movieList.get(0).getName());
    }
}
