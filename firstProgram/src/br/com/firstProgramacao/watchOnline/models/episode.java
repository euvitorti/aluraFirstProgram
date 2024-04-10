package br.com.firstProgramacao.watchOnline.models;

import br.com.firstProgramacao.watchOnline.classification.Classification;

public class Episode implements Classification {
    private int number;
    private String name;
    private TvSeries series;
    private int totalView;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TvSeries getSeries() {
        return series;
    }

    public void setSeries(TvSeries series) {
        this.series = series;
    }

    @Override
    public int getClassification() {
        if (totalView > 100) {
            return 5;
        } else {
            return 3;
        }
    }
    public int getTotalView() {
        return totalView;
    }

    public void setTotalView(int totalView) {
        this.totalView = totalView;
    }
}
