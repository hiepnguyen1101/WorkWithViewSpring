package com.gcs.rms.repository;

import java.util.List;

import com.gcs.rms.model.User;

public interface UserDao {
	User findByUserName(String username);
	public boolean changePassword(String username, String oldPass, String newPass);
	List<User> getAllUsers();
}
