package com.cognizant.outreach.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login_info")
public class LoginInfo {
	
	@Column(name="user_name", nullable=false)
	@Id
	private String userName;
	
	@Column(name="user_pwd", nullable=false)
	private String password;
	
	@Column(name="user_dob")
	private String dob;
	
	@Column(name="mobile_no")
	private String mobileNo;
	
	@Column(name="role_id")
	private Long roleId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
}
