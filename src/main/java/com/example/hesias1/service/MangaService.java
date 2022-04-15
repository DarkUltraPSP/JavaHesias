package com.example.hesias1.service;

import com.example.hesias1.models.Manga;
import com.example.hesias1.repositories.MangaRepository;
import com.example.hesias1.service.converter.entity.MangaDTOConverter;
import com.example.hesias1.service.dto.MangaDTO;
import org.springframework.stereotype.Service;

@Service
public class MangaService extends GenericCRUDService<Manga, MangaDTO, Integer> {


    public MangaService(MangaRepository repository, MangaDTOConverter converter) {
        super(repository, converter);
    }

    @Override
    MangaDTO update(MangaDTO mangaDTO, Integer integer) {
        return null;
    }
}
