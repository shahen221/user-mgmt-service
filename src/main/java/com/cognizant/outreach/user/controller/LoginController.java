package com.cognizant.outreach.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.user.entity.LoginInfo;
import com.cognizant.outreach.user.entity.RoleInfo;
import com.cognizant.outreach.user.model.LoginResponse;
import com.cognizant.outreach.user.model.UserInfo;
import com.cognizant.outreach.user.service.LoginService;
import com.cognizant.outreach.user.service.RoleService;

@RestController
@RequestMapping("/api/login")
public class LoginController {

	private LoginService loginService;
	
	private RoleService roleService;
	
	@Autowired
	public LoginController(LoginService loginService, RoleService roleService) {
		super();
		this.loginService = loginService;
		this.roleService = roleService;
	}


	@PostMapping("/authenticate")
	@CrossOrigin("*")
	public LoginResponse validateUser(@RequestBody UserInfo userInfo) {
		LoginResponse loginResponse = new LoginResponse();
		if(userInfo.getUsername() != null) {
			LoginInfo loginInfo = this.loginService.findUserById(userInfo.getUsername()).get();
			if(loginInfo.getPassword() != null && userInfo.getPassword() != null 
					&& userInfo.getPassword().equals(loginInfo.getPassword())) {
				loginResponse.setStatus("SUCCESS");
				loginResponse.setMessage("Login Successful");
				if(loginInfo.getRoleId() != null) {
					RoleInfo roleInfo = this.roleService.findRoleById(loginInfo.getRoleId()).get();
					loginResponse.setRoleId(roleInfo.getId().toString());
					loginResponse.setRoleName(roleInfo.getName());
				}
				
			}else {
				loginResponse.setStatus("FAILURE");
				loginResponse.setMessage("Invalid Login Credentials");
				loginResponse.setErrorcode("1001");
				loginResponse.setErrormsg("Invalid Login Information");
			}
		}
		return loginResponse;
	}
}
