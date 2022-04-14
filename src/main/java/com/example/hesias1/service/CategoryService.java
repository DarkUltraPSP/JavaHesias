package com.example.hesias1.service;

import com.example.hesias1.models.Anime;
import com.example.hesias1.models.Category;
import com.example.hesias1.repositories.CategoryRepository;
import com.example.hesias1.service.converter.entity.CategoryDTOConverter;
import com.example.hesias1.service.dto.CategoryDTO;

import java.util.Objects;

public class CategoryService extends GenerateCRUD <Category, CategoryDTO, Integer> {
    public CategoryService(CategoryRepository categoryRepository, CategoryDTOConverter categoryDTOConverter) {
        super(categoryDTOConverter,categoryRepository);
    }

    @Override
    CategoryDTO update(CategoryDTO categoryDTO, Integer id) {
        Category category = this.repository.getById(id);

        if (Objects.equals(category.getId(), id)) {
            category = this.converter.dtoToEntity(categoryDTO);
            category = this.repository.save(category);
            return this.converter.entityToDTO(category);
        }
        return null;
    }
}
