package com.example.hesias1.service.dto;

public class AnimeDTO extends MediaDTO{
    private int episodes;
    private Double duration;

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
}
