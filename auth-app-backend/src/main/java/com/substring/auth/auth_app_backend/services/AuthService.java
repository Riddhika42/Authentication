package com.substring.auth.auth_app_backend.services;


import com.substring.auth.auth_app_backend.dtos.UserDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service

public interface AuthService {


    UserDto registerUser(UserDto userDto);
   // UserDto loginUser(UserDto userDto);
}
