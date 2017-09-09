package com.sec.junit.testcases;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import com.sec.user.subsection.UserBean;
import com.sec.user.subsection.UserRoleEnum.StaticUserRoles;
import junit.framework.TestCase;;

public class AutoGraderTestCaseGoodData extends TestCase {

	protected String lecturerRole;
	protected String graderRole;
	protected String taRole;
	protected ArrayList<String> userRolesValidList;

	/**
	 *  Define the pre-required variables before starting the Test.
	 *  This is the "GOOD DATA" test case.
	 */
	@Before
	public void setUp() {
		lecturerRole = "LECTURER";
		graderRole = "GRADER";
		taRole = "TEACHINGASSISTANT";

		userRolesValidList = new ArrayList<String>();
		userRolesValidList.add(lecturerRole);
		userRolesValidList.add(graderRole);
		userRolesValidList.add(taRole);
	}

	/**
	 *  Test if the roles entered are valid.
	 */
	@Test
	public void testRoles() {

		String name = this.getName();
		System.out.println("Test Case Name = " + name);

		this.setName("AutoGraderTestCase1");
		String newName = this.getName();
		System.out.println("Updated Test Case Name = " + newName);

		UserBean user = new UserBean();
		user.setUserId(new Integer(1000));
		user.setPassCode("MockPassword");
		user.setUserName("MockName");
		user.setRole(StaticUserRoles.GRADER);
		assertTrue(userRolesValidList.contains(user.getRole().toString()));

	}

	/**
	 *  tearDown used to close the connection or clean up activities
	 */
	public void tearDown() {
	}
}