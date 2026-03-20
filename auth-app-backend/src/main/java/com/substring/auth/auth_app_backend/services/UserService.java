package com.substring.auth.auth_app_backend.services;


import com.substring.auth.auth_app_backend.dtos.UserDto;

public interface UserService {

    UserDto createUser(UserDto userDto);

    //get user by email
    UserDto getUserByEmail(String email);

    //update user
    UserDto updateUser(UserDto userDto, String userId);

    void deleteUser(String userId);

    //get user by id
    UserDto getUserById(String userId);

    //get all users
    Iterable<UserDto> getAllUsers();
}
