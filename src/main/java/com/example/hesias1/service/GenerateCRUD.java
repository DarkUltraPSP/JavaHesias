package com.example.hesias1.service;

import com.example.hesias1.repositories.AnimeRepository;
import com.example.hesias1.repositories.CategoryRepository;
import com.example.hesias1.service.converter.entity.AnimeDTOConverter;
import com.example.hesias1.service.converter.entity.CategoryDTOConverter;
import com.example.hesias1.service.converter.entity.EntityDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public abstract class GenerateCRUD<ENTITY, DTO, ID> {

    protected JpaRepository<ENTITY, ID> repository;
    protected EntityDtoConverter<ENTITY, DTO> converter;

    public GenerateCRUD(JpaRepository<ENTITY, ID> repository, EntityDtoConverter<ENTITY, DTO> converter) {
        this.repository = repository;
        this.converter = converter;
    }

    public GenerateCRUD(CategoryDTOConverter categoryDTOConverter, CategoryRepository categoryRepository) {
    }

    public GenerateCRUD(AnimeRepository animeRepo, AnimeDTOConverter animeConv) {
    }

    public List<DTO> findAll() {
        List<ENTITY> entity = this.repository.findAll();
        List<DTO> dto = this.converter.listEntityToListDto(entity);
        return dto;
    }

    public DTO findOneByID(ID id) {
        ENTITY entity = repository.getById(id);
        return converter.entityToDTO(entity);
    }

    public void deleteByID(ID id) {
        repository.deleteById(id);
    }

    abstract DTO update(DTO dto, ID id);

    public DTO create(DTO dto) {
        ENTITY entity = converter.dtoToEntity(dto);
        entity = repository.save(entity);

        return converter.entityToDTO(entity);
    }
}
