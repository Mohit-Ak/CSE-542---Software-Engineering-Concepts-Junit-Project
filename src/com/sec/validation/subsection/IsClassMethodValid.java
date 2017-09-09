package com.sec.validation.subsection;

public class IsClassMethodValid {
	public static class ClassMethodValidatorUtil {
		private static int noOfLines;
		
		/**
		 * @return the noOfLines
		 */
		public static int getNoOfLines() {
			return noOfLines;
		}

		/**
		 * @param noOfLines the noOfLines to set
		 */
		public static void setNoOfLines(int noOfLines) {
			ClassMethodValidatorUtil.noOfLines = noOfLines;
		}

		public static boolean isValidClassMethod(String classMethodContent) {
			// Code the logic to check if the input string is a valid Java Class
			// or Method
			String classMethodContentLines[] = classMethodContent.split("\\r?\\n");
			noOfLines=classMethodContentLines.length;
			for(int i=0;i<classMethodContentLines.length;i++){
				// Check if the line is a valid java code.
			}
			return false;
		}
	}
}
