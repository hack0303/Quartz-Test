package com.creating.www.quartz;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.creating.www.examples.example1.ExecuteUnit;

public class QuartzBaseTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		ExecuteUnit.build();
	}

}
