package br.com.firstProgramacao.watchOnline.models;

import br.com.firstProgramacao.watchOnline.classification.classification;
import br.com.firstProgramacao.watchOnline.models.Title;

public class Movie extends Title implements classification {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return 0;
    }
}
