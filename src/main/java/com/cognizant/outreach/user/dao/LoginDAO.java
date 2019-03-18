package com.cognizant.outreach.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.user.entity.LoginInfo;

public interface LoginDAO extends JpaRepository<LoginInfo, String> {

}
