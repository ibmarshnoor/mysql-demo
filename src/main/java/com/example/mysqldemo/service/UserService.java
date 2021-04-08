package com.example.mysqldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysqldemo.entity.User;
import com.example.mysqldemo.repo.UserRepository;

@Service
public class UserService implements IUserService{
	@Autowired
	UserRepository userRepository;
	@Override
	public int save(User user) {
		User savedUser = userRepository.save(user);
		return savedUser.getId();
	}
	
	public List<User> getUser() {
		return userRepository.findAll();
	}
	

	public void deleteUser(Integer userId) {
		userRepository.deleteById(userId);
	}

//	public void updateUser(User user) {
//		// TODO Auto-generated method stub
//		
//	}

	public void updateUser(User user) {
		 userRepository.save(user);
	}

	
}