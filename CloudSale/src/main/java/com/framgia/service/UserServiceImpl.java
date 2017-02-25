package com.framgia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.framgia.dao.UserDao;
import com.framgia.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}

	@Override
	public User findUSerById(int identity) {
		// TODO Auto-generated method stub
		return userDao.findUSerById(identity);
	}

	@Override
	public User findUserByInstance(User instance) {
		// TODO Auto-generated method stub
		return userDao.findUserByInstance(instance);
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	@Override
	public void editUser(User user) {
		// TODO Auto-generated method stub
		userDao.editUser(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userDao.deleteUser(user);
	}

}
