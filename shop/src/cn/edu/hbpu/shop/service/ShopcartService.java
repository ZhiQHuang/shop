package cn.edu.hbpu.shop.service;

import java.util.List;

import cn.edu.hbpu.shop.pojo.Shopcart;
import cn.edu.hbpu.shop.pojo.ShopcartPojo;

public interface ShopcartService {
	void insertCart(Shopcart cart);
	List<ShopcartPojo> getShopcartPojoByUid(Integer uid);
	void modify(Shopcart cart);
	void delete(Integer sid);
}
