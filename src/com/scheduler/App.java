package com.scheduler;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws Exception {
		new ClassPathXmlApplicationContext("com/scheduler/Spring-Quartz.xml");
	}
}