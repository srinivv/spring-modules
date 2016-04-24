package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDao extends HibernateDaoSupport {
 
	public static JdbcTemplate myJdbcTemplate;

	public static JdbcTemplate getMyJdbcTemplate() {
		return myJdbcTemplate;
	}

	public static void setMyJdbcTemplate(JdbcTemplate myJdbcTemplate) {
		BaseDao.myJdbcTemplate = myJdbcTemplate;
	}

}
