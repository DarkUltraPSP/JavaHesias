package com.example.hesias1.service.converter.entity;

import java.util.List;

public interface EntityDtoConverter<ENTITY, DTO> {
    ENTITY dtoToEntity(DTO dto);
    DTO entityToDTO(ENTITY entity);

    List<DTO> listEntityToListDto(List<ENTITY> entities);
    List<ENTITY> listDtoToListEntity(List<DTO> dtos);
}
