package com.example.hesias1.models;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Anime")
public class Anime extends Media {

    @Column
    private int episodes;

    @Column
    private Double duration;

    public Anime(UUID id, String title, Date debutDate, Date endDate, String description, String cover, Double duration, int episodes) {
    }

    public Anime(UUID id, String title, String debutDate, String endDate, String description, String cover, int episodes, Double duration) {
        super(id, title, debutDate, endDate, description, cover);
        this.episodes = episodes;
        this.duration = duration;
    }

    public Anime() {

    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
