package com.example.mysqldemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysqldemo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	List<User> getUserByName(String name); //finder method
	List<User> getUserByPhoneNumber(String name);
}
