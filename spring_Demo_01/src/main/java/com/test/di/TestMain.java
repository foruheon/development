package com.test.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String confLoc ="classpath:test.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc);
		TestDAO testDao = ctx.getBean("TestDAOImpl", TestDAOImpl.class);
		
		testDao.printMsg();

	}

}
