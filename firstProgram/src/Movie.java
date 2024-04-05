public class Movie {
    String name;
    int debutYear;
    int durationMovie;
    private int totalEvaluations;
    private double sumOfAssessment;
    private double mediaAssessment;
    boolean includedInThePlan;

    void showMovieInfo(){
        System.out.printf("Movie name: %s.\n", this.name);
        System.out.printf("Debut year: %d.\n", this.debutYear);
        System.out.printf("Media evaluation: %.1f.\n", this.mediaAssessment);
        System.out.printf("Total evaluations: %d.\n", this.totalEvaluations);
    }

    void getMediaAssessment(){
        this.mediaAssessment = sumOfAssessment / totalEvaluations;
    }

    void evaluationMovie(double evaluation){
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
