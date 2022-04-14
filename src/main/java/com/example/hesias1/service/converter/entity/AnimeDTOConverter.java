package com.example.hesias1.service.converter.entity;

import com.example.hesias1.models.Anime;
import com.example.hesias1.service.dto.AnimeDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class AnimeDTOConverter implements EntityDtoConverter <Anime, AnimeDTO> {

    @Override
    public Anime dtoToEntity(AnimeDTO DTO) {
        return new Anime(DTO.getId(), DTO.getTitle(), DTO.getDebutDate(), DTO.getEndDate(), DTO.getDescription(), DTO.getCover(), DTO.getEpisodes(), DTO.getDuration());
    }

    @Override
    public AnimeDTO entityToDTO(Anime ENTITY) {
        AnimeDTO animeDTO = new AnimeDTO();
        BeanUtils.copyProperties(ENTITY, animeDTO);

        return animeDTO;
    }

    @Override
    public List<AnimeDTO> listEntityToListDto(List<Anime> anime) {
        return null;
    }

    @Override
    public List<Anime> listDtoToListEntity(List<AnimeDTO> animeDTOS) {
        return null;
    }
}