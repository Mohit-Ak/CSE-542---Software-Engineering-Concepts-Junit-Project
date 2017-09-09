package com.sec.junit.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import com.sec.validation.subsection.IsClassMethodValid.ClassMethodValidatorUtil;
import junit.framework.TestCase;

/**
 * @author masda
 * This Class validates a simple loop that reads multiple lines and parses them for validity and code coverage.
 * Checks the following cases - 0 Lines, 1 Line, 2 Lines and N Lines
 */
public class AutoGraderTestCaseSimpleLoop extends TestCase {

	protected String studentCode;

	/**
	 * Define the pre-required variables before starting the Test. 
	 * Here the student code us taken has input and different no. of lines are 
	 * and thus our program generates SystemTimeOutException
	 * @throws IOException
	 */
	@Before
	public void setUp() throws IOException {
		FileInputStream fis = new FileInputStream("src/studentcode.txt");
		StringBuilder builder = new StringBuilder();
		int ch;
		while ((ch = fis.read()) != -1) {
			builder.append((char) ch);
		}
		studentCode = builder.toString();
		fis.close();
	}

	/**
	 * The isValidClassMethod loops over each line to check the syntactical correctness of the code.
	 * No. of lines in StudentCode > 0
	 */
	@Test
	public void testLoopNormal() {
		assertTrue(ClassMethodValidatorUtil.isValidClassMethod(studentCode));
	}
	
	/**
	 * The isValidClassMethod loops over each line to check the syntactical correctness of the code.
	 * No. of lines in StudentCode = 0
	 */
	@Test
	public void testLoopEmpty() {
		String emptyString="";
		assertTrue(ClassMethodValidatorUtil.isValidClassMethod(emptyString));
	}

	/**
	 * tearDown used to close the connection or clean up activities
	 */
	public void tearDown() {
	}
}