package cn.edu.hbpu.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.shop.mapper.AdminuserMapper;
import cn.edu.hbpu.shop.pojo.Adminuser;
import cn.edu.hbpu.shop.pojo.AdminuserExample;
import cn.edu.hbpu.shop.service.AdminUserService;

@Service
public class AdminUserServiceImpl implements AdminUserService {
	@Autowired
	public AdminuserMapper adminuserMapper;

	public List<Adminuser> getAdminUserList() {

		AdminuserExample example = new AdminuserExample();
		List<Adminuser> list = adminuserMapper.selectByExample1(example);
		return list;
	}

	public Adminuser getAdminuserByUid(Integer uid) {
		return adminuserMapper.selectByPrimaryKey(uid);

	}

	public void updateAdminUser(Adminuser admin) {
		adminuserMapper.updateByPrimaryKeySelective(admin);
	}

	public void delAdminUser(Integer uid) {
		adminuserMapper.updateStateByPrimaryKey(uid);
	}

	public void insertAdminUser(Adminuser admin) {
		admin.setPassword(admin.getUsername());
		admin.setState(0);
		adminuserMapper.insertSelective(admin);
	}


	public Boolean checkLogin(Integer uid, String password) {

		Adminuser adminuser = adminuserMapper.selectByPrimaryKey(uid);
		if (adminuser != null && adminuser.getPassword().equals(password)) {
			return true;
		} else
			return false;
	
	}

}
