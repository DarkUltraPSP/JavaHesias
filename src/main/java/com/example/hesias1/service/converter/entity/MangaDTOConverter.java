package com.example.hesias1.service.converter.entity;

import com.example.hesias1.models.Manga;
import com.example.hesias1.service.dto.MangaDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MangaDTOConverter implements EntityDtoConverter <Manga, MangaDTO>{


    @Override
    public Manga dtoToEntity(MangaDTO mangaDTO) {
        return new Manga(mangaDTO.getId(), mangaDTO.getTitle(), mangaDTO.getDebutDate(), mangaDTO.getEndDate(), mangaDTO.getDescription(), mangaDTO.getCover(), mangaDTO.getChapters(), mangaDTO.getVolumes());
    }

    @Override
    public MangaDTO entityToDTO(Manga manga) {
        MangaDTO mangaDTO = new MangaDTO();
        BeanUtils.copyProperties(manga, mangaDTO);

        return mangaDTO;
    }

    @Override
    public List<MangaDTO> listEntityToListDto(List<Manga> mangas) {
        return null;
    }

    @Override
    public List<Manga> listDtoToListEntity(List<MangaDTO> mangaDTOS) {
        return null;
    }

}
