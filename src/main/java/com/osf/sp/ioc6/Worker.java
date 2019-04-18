package com.osf.sp.ioc6;

import org.springframework.stereotype.Component;

@Component
public abstract class Worker implements Work{
	protected String workerName;
	protected String departName;
	public Worker(String workerName, String departName) {
		this.workerName = workerName;
		this.departName = departName;
	}
}
