package com.xw.elastic_job;

import org.springframework.beans.factory.annotation.Autowired;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.xw.elastic_job.logic.JobLogic;

public class Hello implements SimpleJob{
	
	@Autowired
	JobLogic jobLogic;

	@Override
	public void execute(ShardingContext shardingContext) {
		System.out.println("test elastic-job start===");
		jobLogic.hello();
		System.out.println("test elastic-job end===");
	}

}
