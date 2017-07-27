package com.me.sis.service;

import java.util.List;

import com.me.sis.dto.UserDto;

public interface UserService {
	public boolean saveUser(UserDto userDTO);

	public boolean updateUser(UserDto userDTO);

	public List<UserDto> getAllUsers();

	public UserDto getUserById(int userId);

	public void deleteUser(int userId);

	public UserDto getUserByUserNameAndPassword(String username, String password);
	
	public UserDto getPasswordByEmail(String email);
	
	public UserDto getPasswordByPassword(String pwd);
}
