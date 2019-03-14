package com.xw.elastic_job.logic.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xw.elastic_job.logic.JobLogic;

@Component("jobLogic")
public class JobLogicImpl implements JobLogic {

	@Autowired
	private JobTask jobTask;

	// TODO 自动注入报错啊！！
//	@Autowired
//	private ExecutorService threadPool;
    private ExecutorService threadPool = Executors.newCachedThreadPool();


	@Override
	public void hello() {
		JobTask jobTaskTemp = (JobTask) jobTask.clone();
		jobTaskTemp.setMethodName("hello");
		threadPool.submit(jobTaskTemp);
		System.out.println("hello");
		
		
	}

}
