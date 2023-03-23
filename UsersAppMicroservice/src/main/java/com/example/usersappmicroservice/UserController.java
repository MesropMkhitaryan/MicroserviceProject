package com.example.usersappmicroservice;

import com.example.usersappmicroservice.dto.UserDto;
import com.example.usersappmicroservice.mapper.UserMapper;
import com.example.usersappmicroservice.service.impl.UserServiceImpl;
import com.example.usersappmicroservice.ui.model.CreateUserRequestModel;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {


    private final Environment environment;

    private final UserMapper mapper;

    private final UserServiceImpl userService;

    @GetMapping("/status/check")
    public String getStatus(){
        return "working on port " + environment.getProperty("local.server.port") ;
    }

    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserRequestModel userModel){

        UserDto map = mapper.map(userModel);
        userService.create(map);
        return "Create user method is called";
    }

}
