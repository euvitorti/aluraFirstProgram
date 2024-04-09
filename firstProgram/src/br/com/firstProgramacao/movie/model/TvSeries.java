package br.com.firstProgramacao.movie.model;

public class TvSeries extends Title{
    private int season;
    private int episodeSeason;
    private int episodeMinutes;
    private boolean active;

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
}
