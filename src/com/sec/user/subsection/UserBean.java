package com.sec.user.subsection;

import com.sec.user.subsection.UserRoleEnum.StaticUserRoles;

public class UserBean {
	   private Integer userId;
	   private String userName;
	   private String passCode;
	   private StaticUserRoles role;
	
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the passCode
	 */
	public String getPassCode() {
		return passCode;
	}
	/**
	 * @param passCode the passCode to set
	 */
	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}
	/**
	 * @return the role
	 */
	public StaticUserRoles getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(StaticUserRoles role) {
		this.role = role;
	}
	
	   
	   
}
