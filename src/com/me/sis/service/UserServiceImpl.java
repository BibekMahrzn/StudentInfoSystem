package com.me.sis.service;

import java.util.List;

import com.me.sis.dao.UserDao;
import com.me.sis.dao.UserDaoImpl;
import com.me.sis.dto.UserDto;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();

	@Override
	public boolean saveUser(UserDto userDTO) {
		return userDao.saveUser(userDTO);
	}

	@Override
	public boolean updateUser(UserDto userDTO) {
		return userDao.updateUser(userDTO);
	}

	@Override
	public List<UserDto> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public UserDto getUserById(int userId) {
		return userDao.getUserById(userId);
	}

	@Override
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);

	}

	@Override
	public UserDto getUserByUserNameAndPassword(String username, String password) {
		return userDao.getUserByUserNameAndPassword(username, password);
	}

	@Override
	public UserDto getPasswordByEmail(String email) {

		return userDao.getPasswordByEmail(email);
	}

	@Override
	public UserDto getPasswordByPassword(String pwd) {

		return userDao.getPasswordByPassword(pwd);
	}

}
