package com.example.hesias1.repositories;

import com.example.hesias1.models.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Integer> {
    @Query("select a from Anime a where a.id = :id")
    Anime findEpisodeById(@Param("id") int id);

    List<Anime> findByDuration(int duration);
    List<Anime> findByEpisodes(int episodes);
}