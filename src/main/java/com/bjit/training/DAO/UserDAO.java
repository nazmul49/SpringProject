package com.bjit.training.DAO;

import com.bjit.training.model.User;

public interface UserDAO {
	public void createUser(User user);
	public void deleteUser(Integer userId);
	public void updateUser(Integer userId, User user);
	public User searchUser(String email, String password);
}
