package com.example.hesias1.service;

import com.example.hesias1.models.Manga;
import com.example.hesias1.repositories.AnimeRepository;
import com.example.hesias1.repositories.CategoryRepository;
import com.example.hesias1.service.converter.entity.AnimeDTOConverter;
import com.example.hesias1.service.converter.entity.CategoryDTOConverter;
import com.example.hesias1.service.converter.entity.EntityDtoConverter;
import com.example.hesias1.service.dto.MangaDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public class MangaService extends GenerateCRUD <Manga, MangaDTO, Integer> {

    public MangaService(JpaRepository<Manga, Integer> repository, EntityDtoConverter<Manga, MangaDTO> converter) {
        super(repository, converter);
    }

    public MangaService(CategoryDTOConverter categoryDTOConverter, CategoryRepository categoryRepository) {
        super(categoryDTOConverter, categoryRepository);
    }

    public MangaService(AnimeRepository animeRepo, AnimeDTOConverter animeConv) {
        super(animeRepo, animeConv);
    }

    @Override
    MangaDTO update(MangaDTO mangaDTO, Integer integer) {
        return null;
    }
}
