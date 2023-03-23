package com.example.usersappmicroservice.service.impl;

import com.example.usersappmicroservice.dto.UserDto;
import com.example.usersappmicroservice.entity.User;
import com.example.usersappmicroservice.mapper.UserMapper;
import com.example.usersappmicroservice.repository.repository.UserRepository;
import com.example.usersappmicroservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserMapper userMapper;

    private final UserRepository userRepository;



    @Override
    public UserDto create(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());
        User user = userMapper.map(userDetails);
        user.setEncryptedPassword("test");
        userRepository.save(user);
        return null;
    }
}
