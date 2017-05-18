package com.gcs.rms.service;

import java.util.List;

import com.gcs.rms.model.User;

public interface IAcccountService {
	boolean changePassword (String username, String oldPass, String newPass);
	List<User> getAllUsers();
}
