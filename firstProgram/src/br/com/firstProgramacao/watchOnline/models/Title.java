package br.com.firstProgramacao.watchOnline.models;

public class Title implements  Comparable<Title>{
    public String name;
    public int debutYear;
    public int duration;
    private int totalEvaluations;
    private double sumOfAssessment;
    private double mediaAssessment;
    boolean includedInThePlan;

    // ESSE CONSTRUTOR É CHAMADO NAS CLASSES FILHAS
    public Title(String name, int debutYear) {
        this.name = name;
        this.debutYear = debutYear;
    }

    public void showMovieInfo(){
        System.out.printf("Movie name: %s.\n", this.name);
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

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalEvaluations() {
        return totalEvaluations;
    }

    // METÓDO PARA COMPARAÇÃO
    @Override
    public int compareTo(Title sort) {
        return this.getName().compareTo(sort.getName());
    }
}
