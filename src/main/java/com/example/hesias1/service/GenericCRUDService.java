package com.example.hesias1.service;

import com.example.hesias1.service.converter.entity.EntityDtoConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class GenericCRUDService<ENTITY, DTO, ID> {

    protected JpaRepository<ENTITY, ID> repository;
    protected EntityDtoConverter<ENTITY, DTO> converter;

    public GenericCRUDService(JpaRepository<ENTITY, ID> repository, EntityDtoConverter<ENTITY, DTO> converter) {
        this.repository = repository;
        this.converter = converter;
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
