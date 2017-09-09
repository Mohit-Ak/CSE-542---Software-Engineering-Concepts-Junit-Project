package com.sec.validation.subsection;

import java.io.File;
import java.sql.Time;
import java.util.concurrent.TimeoutException;


public class ClassValidator extends SuperValidator {
	
		/**
		 *  ValidationResultBean - Stores the percenatageCoverage, timeForCompletition and evaluationTrace.
		 */
		private ValidationResultBean validationResultBean;
		/**
		 *  The percentageCoverage of the students code on the target class.
		 */
		private Float percenatageCoverage;
		/**
		 * The timeForCompletion for evaluating the code coverage.
		 */
		private Time timeForCompletition;
		/**
		 * The evaluationTrace File of the execution used for debugging in case of ambiguities.
		 */
		private File evaluationTrace;
		
		/**
		 * @return the validationResultBean
		 */
		public ValidationResultBean getValidationResultBean() {
			return validationResultBean;
		}

		/**
		 * @param validationResultBean the validationResultBean to set
		 */
		public void setValidationResultBean(ValidationResultBean validationResultBean) {
			this.validationResultBean = validationResultBean;
		}

		/**
		 * @return the percenatageCoverage
		 */
		public Float getPercenatageCoverage() {
			return percenatageCoverage;
		}

		/**
		 * @param percenatageCoverage the percenatageCoverage to set
		 */
		public void setPercenatageCoverage(Float percenatageCoverage) {
			this.percenatageCoverage = percenatageCoverage;
		}



		/**
		 * @return the timeForCompletition
		 */
		public Time getTimeForCompletition() {
			return timeForCompletition;
		}

		/**
		 * @param timeForCompletition the timeForCompletition to set
		 */
		public void setTimeForCompletition(Time timeForCompletition) {
			this.timeForCompletition = timeForCompletition;
		}

		/**
		 * @return the evaluationTrace
		 */
		public File getEvaluationTrace() {
			return evaluationTrace;
		}

		/**
		 * @param evaluationTrace the evaluationTrace to set
		 */
		public void setEvaluationTrace(File evaluationTrace) {
			this.evaluationTrace = evaluationTrace;
		}

		/**
		 * @author masda
		 * The Method validates and calculates the code coverage of the student code and populates the
		 * ValidationResultBean. Note - The method breaks if the time taken to calculate is more than 300 seconds writing down the traces.
		 * @exception - TimeOutException
		 */
		public boolean validate(String entityName, String entityLocation) throws TimeoutException{
			// Write the Business Logic to Get the CodeCoverage and populate the ValidationResultBean.
			
			//Currently Mocking up with dummy values.
			this.setPercenatageCoverage(new Float(77.00));
			this.setTimeForCompletition(new Time(new Long("4000")));
			this.setEvaluationTrace(new File("../Path/To/Trace/File"));
			
			ValidationResultBean resultBean=new ValidationResultBean();
			resultBean.setPercentageCoverage(this.getPercenatageCoverage());
			resultBean.setTimeForCompletion(this.getTimeForCompletition());
			resultBean.setEvaulationTrace(this.getEvaluationTrace());
			
			this.setValidationResultBean(resultBean);
			
			if(this.getTimeForCompletition().getSeconds()<300){
				return true;	
			}else{
				return false;
			}
			
			
		}
}
