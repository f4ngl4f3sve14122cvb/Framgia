package com.framgia.dao;

import java.util.List;

import com.framgia.model.User;

public interface UserDao {
	
	public List<User> findAllUser();
	
	public User findUSerById(int identity);
	
	public User findUserByInstance(User instance);
	
	public void addUser(User user);
	
	public void editUser(User user);
	
	public void deleteUser(User user);

}
