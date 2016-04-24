package com.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspect {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/aspect/applicationContext.xml");
		CustomerBo customer = (CustomerBo) ctx.getBean("customerBo");
		customer.addCustomer();
		
		customer.addCustomerReturnValue();
		
		//customer.addCustomerThrowException();
		
		customer.addCustomerAround("srini");
	}
}
