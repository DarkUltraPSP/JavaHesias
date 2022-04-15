package com.example.hesias1.service;

import com.example.hesias1.models.mediaList.MediaList;
import com.example.hesias1.models.mediaList.MediaListPK;
import com.example.hesias1.repositories.AnimeRepository;
import com.example.hesias1.repositories.CategoryRepository;
import com.example.hesias1.repositories.MediaListRepository;
import com.example.hesias1.service.converter.entity.AnimeDTOConverter;
import com.example.hesias1.service.converter.entity.CategoryDTOConverter;
import com.example.hesias1.service.converter.entity.EntityDtoConverter;
import com.example.hesias1.service.converter.entity.MediaListDTOConverter;
import com.example.hesias1.service.dto.MediaListDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MediaListService extends GenericCRUDService<MediaList, MediaListDTO, MediaListPK> {


    public MediaListService(MediaListRepository repository, MediaListDTOConverter converter) {
        super(repository, converter);
    }

    @Override
    MediaListDTO update(MediaListDTO mediaListDTO, MediaListPK mediaListPK) {
        return null;
    }
}
