package com.bjit.training.services;


import com.bjit.training.DAO.UserDAO;
import com.bjit.training.model.User;

public class UserServiceImpl implements UserService{

	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void addUser(User user) {
		userDAO.createUser(user);
	}

	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(int userId) {
		// TODO Auto-generated method stub
		
	}

	public User getUser(String email, String password) {
		return userDAO.searchUser(email, password);
	}
	
	

}
