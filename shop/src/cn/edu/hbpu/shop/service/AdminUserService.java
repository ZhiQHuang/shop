package cn.edu.hbpu.shop.service;

import java.util.List;

import cn.edu.hbpu.shop.pojo.Adminuser;

public interface AdminUserService {
	public List<Adminuser> getAdminUserList();
	public Adminuser getAdminuserByUid(Integer uid);
	public void updateAdminUser(Adminuser admin);
	public void delAdminUser(Integer uid);
	public void insertAdminUser(Adminuser admin);
	public Boolean checkLogin(Integer uid, String password);
}
