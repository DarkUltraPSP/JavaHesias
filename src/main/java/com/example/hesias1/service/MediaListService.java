package com.example.hesias1.service;

import com.example.hesias1.models.mediaList.MediaList;
import com.example.hesias1.repositories.AnimeRepository;
import com.example.hesias1.repositories.CategoryRepository;
import com.example.hesias1.service.converter.entity.AnimeDTOConverter;
import com.example.hesias1.service.converter.entity.CategoryDTOConverter;
import com.example.hesias1.service.converter.entity.EntityDtoConverter;
import com.example.hesias1.service.dto.MediaListDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public class MediaListService extends GenerateCRUD <MediaList, MediaListDTO, Integer> {
    public MediaListService(JpaRepository<MediaList, Integer> repository, EntityDtoConverter<MediaList, MediaListDTO> converter) {
        super(repository, converter);
    }

    public MediaListService(CategoryDTOConverter categoryDTOConverter, CategoryRepository categoryRepository) {
        super(categoryDTOConverter, categoryRepository);
    }

    public MediaListService(AnimeRepository animeRepo, AnimeDTOConverter animeConv) {
        super(animeRepo, animeConv);
    }

    @Override
    MediaListDTO update(MediaListDTO mediaListDTO, Integer integer) {
        return null;
    }
}
