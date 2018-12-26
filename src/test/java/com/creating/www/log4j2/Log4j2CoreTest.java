package com.creating.www.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Log4j2CoreTest {
   static Logger logger=LogManager.getLogger();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
    /**
     * 控制台上检查是否有HEHE，如果有，日志配置没有问题
     * */
	@Test
	public void test() {
		logger.debug("hehe");
	}

}
