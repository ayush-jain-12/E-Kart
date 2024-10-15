package com.ayush.dreamshops.service.user;

import com.ayush.dreamshops.dto.UserDto;
import com.ayush.dreamshops.model.User;
import com.ayush.dreamshops.request.CreateUserRequest;
import com.ayush.dreamshops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
