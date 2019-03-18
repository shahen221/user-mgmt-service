package com.cognizant.outreach.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.outreach.user.dao.RoleDAO;
import com.cognizant.outreach.user.entity.RoleInfo;

@Service
public class RoleService {

	private RoleDAO roleDAO;
	
	@Autowired
	public RoleService(RoleDAO roleDAO) {
		super();
		this.roleDAO = roleDAO;
	}
	
	public Optional<RoleInfo> findRoleById(Long roleId) {
		return this.roleDAO.findById(roleId);
	}
}
