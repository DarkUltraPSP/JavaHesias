package com.example.hesias1.models;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "Media")
@Inheritance(strategy = InheritanceType.JOINED)
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id;
    @Column
    private String title;
    @Column
    private String debutDate;
    @Column
    private String endDate;
    @Column(length = 2000)
    private String description;
    @Column(length = 2000)
    private String cover;

    @JoinColumn(name = "categories")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Category> categories;

    public Media() {
    }

    public Media(UUID id, String title, String debutDate, String endDate, String description, String cover) {
        this.id = id;
        this.title = title;
        this.debutDate = debutDate;
        this.endDate = endDate;
        this.description = description;
        this.cover = cover;
    }

    public Media(UUID id) {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(String debutDate) {
        this.debutDate = debutDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return Objects.equals(id, media.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
