package com.xw.elastic_job.listener;

import com.dangdang.ddframe.job.executor.handler.JobExceptionHandler;

public class CommonJobExceptionHandler implements JobExceptionHandler {

	@Override
	public void handleException(String jobName, Throwable cause) {
		
		System.out.print("Elastic-job "+jobName+" exception occur in job processing: "+ cause);
	}
}
