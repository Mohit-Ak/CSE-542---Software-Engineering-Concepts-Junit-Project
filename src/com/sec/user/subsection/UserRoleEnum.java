package com.sec.user.subsection;

public class UserRoleEnum {

	public enum StaticUserRoles {
		LECTURER, GRADER, TEACHINGASSISTANT
	}

	UserRoleEnum userRole;
	public UserRoleEnum(UserRoleEnum userRole) {
		this.userRole = userRole;
	}
}