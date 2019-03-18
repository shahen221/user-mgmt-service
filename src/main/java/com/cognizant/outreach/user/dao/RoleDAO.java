package com.cognizant.outreach.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.user.entity.RoleInfo;

public interface RoleDAO extends JpaRepository<RoleInfo, Long> {

}
