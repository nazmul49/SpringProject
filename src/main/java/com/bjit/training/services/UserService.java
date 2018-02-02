package com.bjit.training.services;

import com.bjit.training.model.User;

public interface UserService {
	public void addUser(User user);
	public void deleteUser(int userId);
	public void updateUser(int userId);
	public User getUser(String email, String passowrd);
}
