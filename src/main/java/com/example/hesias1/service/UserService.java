package com.example.hesias1.service;

import com.example.hesias1.models.mediaList.User;
import com.example.hesias1.repositories.UserRepository;
import com.example.hesias1.service.converter.entity.UserDTOConverter;
import com.example.hesias1.service.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

@Service
public class UserService extends GenericCRUDService<User, UserDTO, UUID> {
    public UserService(UserRepository userRepository, UserDTOConverter userDTOConverter) {
        super(userRepository, userDTOConverter);
    }

    @Override
    UserDTO update(UserDTO userDTO, UUID id) {
        User user = this.repository.getById(id);

        if (Objects.equals(user.getId(), id)) {
            user = this.converter.dtoToEntity(userDTO);
            user = this.repository.save(user);
            return this.converter.entityToDTO(user);
        }
        return null;
    }
}
