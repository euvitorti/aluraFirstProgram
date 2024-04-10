package br.com.firstProgramacao.watchOnline.models;

import br.com.firstProgramacao.watchOnline.classification.Classification;

public class Movie extends Title implements Classification {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return getTotalEvaluations() / 2;
    }
}
