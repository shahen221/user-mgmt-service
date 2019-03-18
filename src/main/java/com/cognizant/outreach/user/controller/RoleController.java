package com.cognizant.outreach.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.user.entity.RoleInfo;
import com.cognizant.outreach.user.service.RoleService;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

	private RoleService roleService;

	public RoleController(RoleService roleService) {
		super();
		this.roleService = roleService;
	}
	
	@GetMapping("/{roleId}")
	public RoleInfo findRoleById(@PathVariable Long roleId) {
		return this.roleService.findRoleById(roleId).get();
	}
}
