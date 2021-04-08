package com.example.mysqldemo.service;

import java.util.List;

import com.example.mysqldemo.entity.User;

public interface IUserService {
	int save(User user);

	List<User> getUser();

	void updateUser(User user);

	void deleteUser(Integer userId);
}