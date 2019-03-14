package com.xw.elastic_job.logic.impl;

import java.lang.reflect.Method;

import org.springframework.stereotype.Service;

@Service
public class JobTask implements Runnable, Cloneable {
	
	
	public void hello() {
		System.out.println("hello!!");
	}

	String methodName;

	public JobTask() {
		super();
	}

	public JobTask(String methodName) {
		super();
		this.methodName = methodName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	@Override
	public void run() {
		try {
			Method method = this.getClass().getDeclaredMethod(methodName);
			method.invoke(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
           return  null;
        }
    }
}
