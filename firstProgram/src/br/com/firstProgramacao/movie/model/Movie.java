package br.com.firstProgramacao.movie.model;

public class Movie {
    public String name;
    public int debutYear;
    public int durationMovie;
    private int totalEvaluations;
    private double sumOfAssessment;
    private double mediaAssessment;
    boolean includedInThePlan;

    public void showMovieInfo(){
        System.out.printf("br.com.firstProgramacao.movie.model.Movie name: %s.\n", this.name);
        System.out.printf("Debut year: %d.\n", this.debutYear);
        System.out.printf("Media evaluation: %.1f.\n", this.mediaAssessment);
        System.out.printf("Total evaluations: %d.\n", this.totalEvaluations);
    }

    public void getMediaAssessment(){
        this.mediaAssessment = sumOfAssessment / totalEvaluations;
    }

    public void evaluationMovie(double evaluation){
        this.sumOfAssessment += evaluation;
        this.totalEvaluations++;
        getMediaAssessment();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(int debutYear) {
        this.debutYear = debutYear;
    }

}
