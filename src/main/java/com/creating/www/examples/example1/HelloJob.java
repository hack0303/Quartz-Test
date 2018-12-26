package com.creating.www.examples.example1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job {
    static Logger LOG=LogManager.getLogger();
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.debug("hello,everyone!!");
	}

}
