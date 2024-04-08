import br.com.firstProgramacao.movie.model.Movie;

public class Main {
    public static void main(String[] args) {
        // Reference type
        Movie movieInfo = new Movie();
        movieInfo.evaluationMovie(7);
        movieInfo.evaluationMovie(9);
        movieInfo.name = "Interstellar";
        movieInfo.debutYear = 2014;
        movieInfo.showMovieInfo();
    }
}
