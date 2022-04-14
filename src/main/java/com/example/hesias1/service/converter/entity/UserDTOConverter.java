package com.example.hesias1.service.converter.entity;

import com.example.hesias1.models.mediaList.User;
import com.example.hesias1.service.dto.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDTOConverter implements EntityDtoConverter<User, UserDTO> {

    @Override
    public User dtoToEntity(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getMail());
    }

    @Override
    public UserDTO entityToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }

    @Override
    public List<UserDTO> listEntityToListDto(List<User> users) {
        return null;
    }

    @Override
    public List<User> listDtoToListEntity(List<UserDTO> userDTOS) {
        return null;
    }
}