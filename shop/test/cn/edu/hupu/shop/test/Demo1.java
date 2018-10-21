package cn.edu.hupu.shop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.hbpu.shop.pojo.User;
import cn.edu.hbpu.shop.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo1 {

	@Autowired
	private UserService userService;
	
//	@Autowired
//	private AdminService adminService;

	@Test
	public void test01(){
		User user = new User();
		user.setUsername("qq");
		user.setName("jhf");
		userService.save(user);
	}
	
	@Test
	public void test02(){
		User user = new User();
		user.setUid(7);
		user.setName("xx");
		userService.update(user);
	}
	
//	@Test
//	public void test03(){
//		System.out.println(adminService.checkAdminUser(3, "zhang1"));
//	}
	
	
}












