package com.nazir.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.nazir.dao.UserDao;
import com.nazir.model.User;
import com.nazir.service.TestService;

public class TestServiceImpl implements TestService {

	@Autowired
	private UserDao userDao;
	
	public User getById(Long id) {
		return userDao.getById(id);
	}

}
