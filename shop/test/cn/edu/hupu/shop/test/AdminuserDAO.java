package cn.edu.hupu.shop.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.edu.hbpu.shop.pojo.Adminuser;

@Repository("adminuerDAO")
public class AdminuserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int addAdmin(Adminuser adminuser){
		int i = jdbcTemplate.update("insert into adminuser (username, password, type, state) values (?,?,?,0)", 
				adminuser.getUsername(), adminuser.getPassword(), adminuser.getType());
		return i;
		
	}
	
	public Boolean checkAdminuser(Integer uid, String password) {
		
		List<Adminuser> list = jdbcTemplate.query(
				"select * from adminuser where uid=? and password=?",
				new Object[] { uid, password }, new MyRowMapper());
		if(list != null && list.size()>0)
			return true;
		else
			return false;

	}
}
