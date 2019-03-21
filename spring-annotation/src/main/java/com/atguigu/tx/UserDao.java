package com.atguigu.tx;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired //×Ô¶¯×¢Èë
	private JdbcTemplate jdbcTemplate;
	
	public void insert() {
		String sql = "INSERT INTO test_user(username,age) VALUES (?,?)";
		String username = UUID.randomUUID().toString().substring(0, 5);
		jdbcTemplate.update(sql, username,18);
	}
}
