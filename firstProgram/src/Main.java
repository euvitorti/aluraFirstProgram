import br.com.firstProgramacao.watchOnline.models.Movie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Reference type
        Movie movieInfo = new Movie();
        movieInfo.evaluationMovie(7);
        movieInfo.evaluationMovie(9);
        movieInfo.name = "Interstellar";
        movieInfo.debutYear = 2014;
        movieInfo.showMovieInfo();

        Movie movie = new Movie();
        movie.evaluationMovie(2);
        movie.evaluationMovie(9);
        movie.name = "Bot";
        movie.debutYear = 2008;
        movie.showMovieInfo();

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(movieInfo);
        movieList.add(movie);
        System.out.printf("Size: %d\n", movieList.size());
        System.out.printf("Name of the first movie: %s", movieList.get(0).getName());
    }
}
