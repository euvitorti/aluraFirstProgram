package br.com.firstProgramacao.watchOnline.models;

public class TvSeries extends Title {
    private int season;
    private int episodeSeason;
    private int episodeMinutes;
    private boolean active;

    // CONSTRUTOR NÃO É HERDADO, LOGO TEM QUE FAZER UM QUE É CORRESPONDENTE A CLASSE PRINCIPAL
    public TvSeries(String name, int debutYear) {
        super(name, debutYear);
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodeSeason() {
        return episodeSeason;
    }

    public void setEpisodeSeason(int episodeSeason) {
        this.episodeSeason = episodeSeason;
    }

    public int getEpisodeMinutes() {
        return episodeMinutes;
    }

    public void setEpisodeMinutes(int episodeMinutes) {
        this.episodeMinutes = episodeMinutes;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public int getDuration(){
        return season * episodeSeason * episodeMinutes;
    }

    public String toString(){
        return "Serie: " + this.getName();
    }
}
