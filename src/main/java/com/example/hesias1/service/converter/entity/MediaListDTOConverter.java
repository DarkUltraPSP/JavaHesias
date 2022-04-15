package com.example.hesias1.service.converter.entity;

import com.example.hesias1.models.Media;
import com.example.hesias1.models.mediaList.MediaList;
import com.example.hesias1.models.mediaList.MediaListPK;
import com.example.hesias1.models.mediaList.User;
import com.example.hesias1.service.dto.MediaListDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MediaListDTOConverter implements EntityDtoConverter <MediaList, MediaListDTO> {
    @Override
    public MediaList dtoToEntity(MediaListDTO mediaListDTO) {
        return new MediaList(new MediaListPK(
                new User(mediaListDTO.getUserDTO().getId()),
                new Media(mediaListDTO.getMediaDTO().getId())
        ));
    }

    @Override
    public MediaListDTO entityToDTO(MediaList ENTITY) {
        MediaList mediaList = new MediaList();
        BeanUtils.copyProperties(ENTITY, mediaList);
        return null;
    }

    @Override
    public List<MediaListDTO> listEntityToListDto(List<MediaList> mediaLists) {
        return null;
    }

    @Override
    public List<MediaList> listDtoToListEntity(List<MediaListDTO> mediaListDTOS) {
        return null;
    }
}
