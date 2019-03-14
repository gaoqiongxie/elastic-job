package com.xw.elastic_job.listener;

import com.alibaba.fastjson.JSONObject;
import com.dangdang.ddframe.job.executor.ShardingContexts;
import com.dangdang.ddframe.job.lite.api.listener.ElasticJobListener;

public class CommonElasticJobListener implements ElasticJobListener{

	@Override
	public void beforeJobExecuted(ShardingContexts shardingContexts) {
		System.out.println("【Elastic-Job-" + shardingContexts.getJobName() + "】任务开始执行====" + JSONObject.toJSONString(shardingContexts));
	}


	@Override
	public void afterJobExecuted(ShardingContexts shardingContexts) {
		System.out.println("【Elastic-Job-" + shardingContexts.getJobName() + "】任务执行结束====" + JSONObject.toJSONString(shardingContexts));
	}


}
