package cn.edu.hbpu.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import cn.edu.hbpu.shop.mapper.UserMapper;
import cn.edu.hbpu.shop.pojo.User;
import cn.edu.hbpu.shop.pojo.UserExample;
import cn.edu.hbpu.shop.service.UserService;
@Service("userService")
	public class UserServiceImpl implements UserService{
		@Autowired
		private UserMapper userMapper;
		public void save(User user){
			userMapper.insert(user);
		}
		public void delete(User user){
			userMapper.deleteByPrimaryKey(user.getUid());
		}
			
		public void update(User user){
			userMapper.updateByPrimaryKeySelective(user);
		}
		
		public List<User> findAll(){
			UserExample example = new UserExample();
			example.createCriteria().andUsernameLike("a");
			List<User> list = userMapper.selectByExample(example);
			return list;
		}
		
		public User findByUid(Integer uid){
			return userMapper.selectByPrimaryKey(uid);
			
		}
		public Boolean checkLogin(User user) {
			User user2 = userMapper.selectByPrimaryKey(user.getUid());
			if(user2 != null && user2.getPassword().equals(user.getPassword())){
				return true;
			}
				return false;
		}
	}

