package com.creating.www.examples.example1;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.DateBuilder;
import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class ExecuteUnit {
	static Logger logger=LogManager.getLogger();
public static void build() 
{    
	Scheduler sched=null;
	try {
		sched=new StdSchedulerFactory().getScheduler();
	} catch (SchedulerException e) {
		logger.error(e);
	}
	JobDetail jd=JobBuilder.newJob(HelloJob.class).withIdentity("hello-job","group1").build();
	Date startTime=DateBuilder.evenMinuteDate(new Date());
	Trigger tg=TriggerBuilder.newTrigger().withIdentity("hello-trigger","group1").startAt(startTime).build();
	try {
		sched.scheduleJob(jd, tg);
	} catch (SchedulerException e) {
		logger.error(e);
	}
	try {
		sched.start();
	} catch (SchedulerException e) {
		logger.error(e);
	}
	try {
		logger.debug("{}","休眠55s");
		Thread.sleep(55*1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	logger.debug("希望5s后有调度任务输出结果");
	try {
		sched.shutdown(true);
	} catch (SchedulerException e) {
		logger.error(e);
	}
	logger.debug("任务结束，关闭程序");
	System.exit(0);
}
}
