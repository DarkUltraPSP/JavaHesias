package com.example.hesias1.repositories;

import com.example.hesias1.models.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MangaRepository extends JpaRepository <Manga, Integer> {
    @Query("select m from Manga m where m.id = :id")
    Manga findById(@Param("id") int id);
}
