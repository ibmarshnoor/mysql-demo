package com.example.mysqldemo.service;

import java.util.List;
import java.util.Optional;

import com.example.mysqldemo.entity.User;

public interface IUserService {
	int save(User user);

	List<User> getUsers();

	void updateUser(User user);

	void deleteUser(Integer userId);

	Optional<User> getUser(int userId);
	
	List<User> getUsersByName(String name);
	
}