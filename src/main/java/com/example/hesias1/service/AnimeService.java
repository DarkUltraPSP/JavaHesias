package com.example.hesias1.service;

import com.example.hesias1.models.Anime;
import com.example.hesias1.repositories.AnimeRepository;
import com.example.hesias1.service.converter.entity.AnimeDTOConverter;
import com.example.hesias1.service.dto.AnimeDTO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

public class AnimeService extends GenerateCRUD <Anime, AnimeDTO, Integer> {
    @Autowired
    private final AnimeRepository animeRepo;
    @Autowired
    private final AnimeDTOConverter animeConv;

    public AnimeService(AnimeRepository animeRepo, AnimeDTOConverter animeConv) {
        super(animeRepo, animeConv);
        this.animeRepo = animeRepo;
        this.animeConv = animeConv;
    }

    @Transactional
    public List<AnimeDTO> findByDuration(int duration) {
        List<Anime> anime= ((AnimeRepository)this.repository).findByDuration((duration));
        List<AnimeDTO> dtos = this.converter.listEntityToListDto(anime);
        return dtos;
    }

    public List<AnimeDTO> findByEpisodes(int episodes) {
        return this.converter.listEntityToListDto(((AnimeRepository) this.repository).findByEpisodes(episodes));
    }

    @Override
    AnimeDTO update(AnimeDTO animeDTO, Integer id) {
        Anime anime = this.repository.getById(id);

        if (Objects.equals(anime.getId(), id)) {
            anime = this.converter.dtoToEntity(animeDTO);
            anime = this.repository.save(anime);
            return this.converter.entityToDTO(anime);
        }
        return null;
    }
}
