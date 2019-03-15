package com.xw.elastic_job.config;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  先把Bean注入，不然 @Autowired   private ExecutorService executorService; 会报错，
 * @Date 2019-03-14 17:19:22
 * @Description 
 *
 */
@Configuration
public class ThreadPoolConfig {
	
//	@Bean
//    public ExecutorService getThreadPool() {
//        System.out.println("ExecutorService getThreadPool()...");
//        return new ThreadPoolExecutor(2, 5, 10, TimeUnit.SECONDS,
//                new LinkedBlockingDeque<>());
//    }
}
