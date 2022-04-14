package com.example.hesias1.models.mediaList;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id;
    @Column
    private String name;
    @Column
    private String mail;

    public User(UUID id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    public User(String name, String mail) {
        this.id = new UUID(0L,0L);
        this.name = name;
        this.mail = mail;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
