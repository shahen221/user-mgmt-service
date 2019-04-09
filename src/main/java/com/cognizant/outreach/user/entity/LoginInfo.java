package com.cognizant.outreach.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="login_info")
public class LoginInfo {
	
	@Column(name="user_name", nullable=false)
	@Id
	private String userName;
	
	@Column(name="employee_id",insertable=false, updatable=false)
	private Long employeeId;
	
	@OneToOne
	@JoinColumn(name="employee_id")
	private EmployeeInfo employeeInfo;
	
	@Column(name="user_pwd", nullable=false)
	private String password;
	
	@Column(name="user_dob")
	private String dob;
	
	@Column(name="mobile_no")
	private String mobileNo;
	
	@OneToOne
	@JoinColumn(name="role_id")
	private RoleInfo roleInfo;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

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

	public RoleInfo getRoleInfo() {
		return roleInfo;
	}

	public void setRoleInfo(RoleInfo roleInfo) {
		this.roleInfo = roleInfo;
	}

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

}
