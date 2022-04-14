package com.example.hesias1.models.mediaList;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

import com.example.hesias1.models.Media;

@Embeddable
public class MediaListPK implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne()
    private Media media;

    protected MediaListPK() {
    }

    public MediaListPK(User user, Media media) {
        this.user = user;
        this.media = media;
    }

    public User getUser() {
        return this.user;
    }

    public Media getMedia() {
        return media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediaListPK that = (MediaListPK) o;
        return Objects.equals(user, that.user) && Objects.equals(media, that.media);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, media);
    }
}
