package com.sec.junit.testrunners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.sec.junit.testcases.AutoGraderTestCaseBad;
import com.sec.junit.testcases.AutoGraderTestCaseBoundryCond;
import com.sec.junit.testcases.AutoGraderTestCaseGoodData;
import com.sec.junit.testcases.AutoGraderTestCaseSimpleLoop;

public class AutoGraderTestRunner {
	
	public void runBadData(){
		Result result = JUnitCore.runClasses(AutoGraderTestCaseBad.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}
	public void runGoodData(){
		Result result = JUnitCore.runClasses(AutoGraderTestCaseGoodData.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}
	public void runSimpleLoop(){
		Result result = JUnitCore.runClasses(AutoGraderTestCaseSimpleLoop.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}
	public void runBoundryConditions(){
		Result result = JUnitCore.runClasses(AutoGraderTestCaseBoundryCond.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}
	public static void main(String[] args) {
		AutoGraderTestRunner autoGraderTestRunner=new AutoGraderTestRunner();
		autoGraderTestRunner.runBadData();
		autoGraderTestRunner.runGoodData();
		autoGraderTestRunner.runSimpleLoop();
		autoGraderTestRunner.runBoundryConditions();
	   }
}