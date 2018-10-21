package cn.edu.hupu.shop.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cn.edu.hbpu.shop.pojo.Adminuser;

public class MyRowMapper implements RowMapper<Adminuser>{

	public Adminuser mapRow(ResultSet rs, int rowNum) throws SQLException {
		Adminuser adminuser = new Adminuser();
		adminuser.setUid(rs.getInt("uid"));
		adminuser.setType(rs.getString("type"));
		adminuser.setState(rs.getInt("type"));
		adminuser.setPassword(rs.getString("password"));
		adminuser.setUsername(rs.getString("username"));
		return adminuser;
	}
	
}
