package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MyDao extends BaseDao {

	public void testMe() {
		JdbcTemplate jdbcTemplate = getMyJdbcTemplate();
		jdbcTemplate.execute("update registration set password='vasan' where username = 'srini'");
		System.out.println(jdbcTemplate);
	}

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("test/dao/applicationContext.xml");
		MyDao myDao = (MyDao) ctx.getBean("myDao", MyDao.class);
		myDao.testMe();
	}
}
