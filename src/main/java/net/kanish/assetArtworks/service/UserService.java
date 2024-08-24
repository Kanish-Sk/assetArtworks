package net.kanish.assetArtworks.service;

import java.util.List;

import net.kanish.assetArtworks.model.User;
import net.kanish.assetArtworks.web.dto.UserDto;


public interface UserService {
	
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}