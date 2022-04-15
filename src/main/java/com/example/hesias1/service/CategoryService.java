package com.example.hesias1.service;

import com.example.hesias1.models.Category;
import com.example.hesias1.repositories.CategoryRepository;
import com.example.hesias1.service.converter.entity.CategoryDTOConverter;
import com.example.hesias1.service.dto.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CategoryService extends GenericCRUDService<Category, CategoryDTO, Integer> {
    public CategoryService(CategoryRepository categoryRepository, CategoryDTOConverter categoryDTOConvert) {
        super(categoryRepository,categoryDTOConvert);
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
