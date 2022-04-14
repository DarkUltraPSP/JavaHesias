package com.example.hesias1.service.dto;

public class MangaDTO extends MediaDTO{
    private int chapters;
    private Double volumes;

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
