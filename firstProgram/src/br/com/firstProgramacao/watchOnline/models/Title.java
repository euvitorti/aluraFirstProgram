package br.com.firstProgramacao.watchOnline.models;

import br.com.firstProgramacao.watchOnline.exception.InvalidYearException;

public class Title implements Comparable<Title>{
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

    public Title(OmdbTitle omdbTitle) {
        this.name = omdbTitle.title();

        if (omdbTitle.year().length() > 4) {
            // EXCEÇÃO PERSONALIZADA
            throw new InvalidYearException("Year is incorrect");
        }

        this.debutYear = Integer.valueOf(omdbTitle.year());
        this.duration = Integer.valueOf(omdbTitle.year().substring(0,3));
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

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Year: " + debutYear + '\n' +
                "Duration: " + duration;
    }
}
