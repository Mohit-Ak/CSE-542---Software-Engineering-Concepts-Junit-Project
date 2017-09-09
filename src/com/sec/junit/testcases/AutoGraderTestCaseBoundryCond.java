package com.sec.junit.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.junit.Before;
import org.junit.Test;

import com.sec.validation.subsection.ClassValidator;
import com.sec.validation.subsection.IsClassMethodValid.ClassMethodValidatorUtil;

import junit.framework.TestCase;


/**
 * @author masda
 * This Class validates 
 * 1)The Input Boundary conditions checks if the number of lines is [0-3 : Fail] or [More : True]. 
 * LowerLimit - 3 (Minimum no lines of a java program)
 * 2)The Output Boundary conditions for the time taken to evaluate the code.
 * Upper Limit - More than 300 seconds to compute the coverage. We would create a SystemTimeOut Exception.
 * This is implemented by having faulty complicated logic while trying to evaluate the students code (e.g Infinite loops that don't break)
 */
public class AutoGraderTestCaseBoundryCond extends TestCase {

	protected int noOfLinesThreshold;
	protected String entityName;
	protected String entityLocation;
	protected String studentCode;

	/**
	 * Define the pre-required variables before starting the Test. 
	 * Here the student code is in such a way that it causes the evaluation to go more than 300 seconds 
	 * and thus our program generates SystemTimeOutException
	 * @throws IOException
	 */
	@Before
	public void setUp() throws IOException {
		 entityName = "StudentCode";
		 entityLocation = "src/studentcode.txt";
		 noOfLinesThreshold=3;
		 
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
	 * Test if the no of lines is 
	 * [noOfLines = 0-3 : Fail] 
	 * [noOfLines > 3 : True]
	 * @throws TimeoutException 
	 */
	@Test
	public void testBoundryConditionsLines() {
		try {
			ClassMethodValidatorUtil.isValidClassMethod(studentCode);
			assertTrue(ClassMethodValidatorUtil.getNoOfLines()>noOfLinesThreshold);
		} catch (Exception e) {
			fail();
		}
	}
	/**
	 * Test if the TimeTaken to evaluate the CodeCoverage is more than the threshold of 5 minutes.
	 * timeout is useful to catch and terminate infinite loops, it should not be considered deterministic.
	 * @throws TimeoutException 
	 */
	@Test(expected=TimeoutException.class, timeout=300)
	public void testBoundryConditionsTime() {
		ClassValidator classValidator=new ClassValidator();
		try {
			classValidator.validate(entityName, entityLocation);
			int timeForCompletion=classValidator.getTimeForCompletition().getSeconds();
			assertTrue(timeForCompletion>300);
		} catch (TimeoutException e) {
			fail();
		}
	}

	/**
	 * tearDown used to close the connection or clean up activities
	 */
	public void tearDown() {
	}
}