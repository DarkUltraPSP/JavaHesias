package com.example.hesias1.models.mediaList;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "media_list")
@AssociationOverrides({
        @AssociationOverride(name = "list.user", joinColumns = @JoinColumn(name = "user_id")),
        @AssociationOverride(name = "list.media", joinColumns = @JoinColumn(name = "media_id"))
})
public class MediaList {

    @EmbeddedId
    private MediaListPK list;

    @Column
    private String commentary;

    @Column
    private int mark;

    @Column
    private Date date;

    public MediaList(MediaListPK list) {
        this.list = list;
        this.date = new Date(Instant.now().getNano());
    }

    public MediaList(MediaListPK list, String commentary, int mark) {
        this.list = list;
        this.commentary = commentary;
        this.mark = mark;
        this.date = new Date(Instant.now().getNano());
    }

    public MediaList() {

    }

    public MediaListPK getList() {
        return list;
    }

    public String getCommentary() {
        return commentary;
    }

    public int getMark() {
        return mark;
    }

    public Date getDate() {
        return date;
    }
}
