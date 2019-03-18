package com.cognizant.outreach.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.outreach.user.dao.LoginDAO;
import com.cognizant.outreach.user.entity.LoginInfo;

@Service
public class LoginService {

	private LoginDAO loginDAO;
	
	@Autowired
	public LoginService(LoginDAO loginDAO) {
		super();
		this.loginDAO = loginDAO;
	};
	
	public Optional<LoginInfo> findUserById(String userName) {
		return this.loginDAO.findById(userName);
	}
	
}
