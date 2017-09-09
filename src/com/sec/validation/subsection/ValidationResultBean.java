package com.sec.validation.subsection;

import java.io.File;
import java.sql.Time;

public class ValidationResultBean {
	private Time timeForCompletion;
	private float percentageCoverage;
	private File evaulationTrace;
	/**
	 * @return the timeForCompletion
	 */
	public Time getTimeForCompletion() {
		return timeForCompletion;
	}
	/**
	 * @param timeForCompletion the timeForCompletion to set
	 */
	public void setTimeForCompletion(Time timeForCompletion) {
		this.timeForCompletion = timeForCompletion;
	}
	/**
	 * @return the percentageCoverage
	 */
	public float getPercentageCoverage() {
		return percentageCoverage;
	}
	/**
	 * @param percentageCoverage the percentageCoverage to set
	 */
	public void setPercentageCoverage(float percentageCoverage) {
		this.percentageCoverage = percentageCoverage;
	}
	/**
	 * @return the evaulationTrace
	 */
	public File getEvaulationTrace() {
		return evaulationTrace;
	}
	/**
	 * @param evaulationTrace the evaulationTrace to set
	 */
	public void setEvaulationTrace(File evaulationTrace) {
		this.evaulationTrace = evaulationTrace;
	}
	
	
}
