package br.com.firstProgramacao.watchOnline.models;

import br.com.firstProgramacao.watchOnline.models.Title;

public class Movie extends Title {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
