package com.example.hesias1.models;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Manga")
public class Manga extends Media {

    @Column
    private int chapters;

    @Column
    private Double volumes;

    public Manga(UUID id, String title, String debutDate, String endDate, String description, String cover, int chapters, Double volumes) {
        super(id, title, debutDate, endDate, description, cover);
        this.chapters = chapters;
        this.volumes = volumes;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public Double getVolumes() {
        return volumes;
    }

    public void setVolumes(Double volumes) {
        this.volumes = volumes;
    }
}
