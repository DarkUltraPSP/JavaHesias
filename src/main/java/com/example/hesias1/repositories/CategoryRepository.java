package com.example.hesias1.repositories;

import com.example.hesias1.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    List<Category> findByDescription(String description);

    @Query("select c from Category c where c.description like :description")
    List<Category> findByDescriptionLike(@Param("description") String description);

    List<Category> findByNameLike(String name);

    Optional<Category> findByName(String name);
}