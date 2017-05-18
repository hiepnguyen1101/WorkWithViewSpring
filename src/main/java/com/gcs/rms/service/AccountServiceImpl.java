package com.gcs.rms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gcs.rms.model.User;
import com.gcs.rms.repository.UserDao;

@Repository
public class AccountServiceImpl implements IAcccountService {
	@Autowired
	UserDao userDao;

	public boolean changePassword(String id, String oldPass, String newPass) {
		return userDao.changePassword(id, oldPass, newPass);
	}

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

}
