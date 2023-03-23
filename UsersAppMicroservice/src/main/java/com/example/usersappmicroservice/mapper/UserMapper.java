package com.example.usersappmicroservice.mapper;

import com.example.usersappmicroservice.dto.UserDto;
import com.example.usersappmicroservice.entity.User;
import com.example.usersappmicroservice.ui.model.CreateUserRequestModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User map(UserDto userDto);

    UserDto map(User user);
    UserDto map(CreateUserRequestModel user);

}
