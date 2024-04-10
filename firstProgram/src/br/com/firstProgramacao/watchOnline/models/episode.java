package br.com.firstProgramacao.watchOnline.models;

public class episode {
    private int number;
    private String name;
    private TvSeries series;

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
}
