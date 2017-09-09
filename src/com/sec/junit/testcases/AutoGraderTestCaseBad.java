package com.sec.junit.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import com.sec.validation.subsection.IsClassMethodValid.ClassMethodValidatorUtil;
import junit.framework.TestCase;;
public class AutoGraderTestCaseBad extends TestCase {

	protected String studentCode;

	/**
	 * Define the pre-required variables before starting the Test.
	 * 
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
		System.out.println(studentCode);
		fis.close();
	}

	/**
	 * Test if the <.....>
	 */
	@Test
	public void testInputFile() {

		assertNotNull(studentCode);
		assertTrue(ClassMethodValidatorUtil.isValidClassMethod(studentCode));
	}

	/**
	 * tearDown used to close the connection or clean up activities
	 */
	public void tearDown() {
	}
}