package com.example.hesias1.service.converter.entity;

import com.example.hesias1.models.Category;
import com.example.hesias1.service.dto.CategoryDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class CategoryDTOConverter implements EntityDtoConverter <Category, CategoryDTO>{
    @Override
    public Category dtoToEntity(CategoryDTO catDTO) {
        return new Category(catDTO.getId(), catDTO.getName(), catDTO.getDescription());
    }

    @Override
    public CategoryDTO entityToDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        BeanUtils.copyProperties(category, categoryDTO);

        return categoryDTO;
    }

    @Override
    public List<CategoryDTO> listEntityToListDto(List<Category> categories) {
        return null;
    }

    @Override
    public List<Category> listDtoToListEntity(List<CategoryDTO> categoryDTOS) {
        return null;
    }
}
