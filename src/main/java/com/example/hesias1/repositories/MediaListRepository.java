package com.example.hesias1.repositories;

import com.example.hesias1.models.Media;
import com.example.hesias1.models.mediaList.MediaList;
import com.example.hesias1.models.mediaList.MediaListPK;
import com.example.hesias1.models.mediaList.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MediaListRepository extends JpaRepository<MediaList, MediaListPK> {
    @Query("select m from MediaList ml join ml.list.user u join ml.list.media m where u = :user")
    List<Media> findByUser(@Param("user") User user);

    @Query("select ml from MediaList ml join ml.list.media m where m = :media")
    List<MediaList> findMediaListByMedia(@Param("media") Media media);

    @Query("Select ml from MediaList ml join ml.list.media m where m.id = :id")
    List<MediaList> findMediaListByMediaId(@Param("id") Integer id);
}
