package com.example.hesias1.repositories;

import com.example.hesias1.models.mediaList.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository <User, UUID> {
    @Query("select u from User u where u.id = :id")
    Optional<User> findById(@Param("id")UUID id);

    //@Query("select u from User u where u.name = :name")
    List<User> findByName(@Param("id") String name);
}
