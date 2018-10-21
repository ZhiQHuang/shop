package cn.edu.hbpu.shop.service;

import org.springframework.stereotype.Component;

import cn.edu.hbpu.shop.pojo.User;


@Component
public interface UserService {
	public void save(User user);
	public void delete(User user);
	public void update(User user);
	Boolean checkLogin(User user);
}
