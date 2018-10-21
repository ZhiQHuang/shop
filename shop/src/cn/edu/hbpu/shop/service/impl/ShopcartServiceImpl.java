package cn.edu.hbpu.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.shop.mapper.ShopcartMapper;
import cn.edu.hbpu.shop.pojo.Product;
import cn.edu.hbpu.shop.pojo.Shopcart;
import cn.edu.hbpu.shop.pojo.ShopcartPojo;
import cn.edu.hbpu.shop.service.ShopcartService;

@Service
public class ShopcartServiceImpl implements ShopcartService {
	@Autowired
	private ShopcartMapper shopcartMapper;
	
	private void changeShopcartPojoList(List<ShopcartPojo> list){
		for (int i = 0; i < list.size(); i++) {
			ShopcartPojo shopcartPojo = list.get(i);
			String image = shopcartPojo.getImage();
			String[] split = image.split(",");
			shopcartPojo.setImage("/pic/" + split[0]);
		}
	}
	
	public void insertCart(Shopcart cart) {
		shopcartMapper.insert(cart);
	}
	
	public List<ShopcartPojo> getShopcartPojoByUid(Integer uid) {
		List<ShopcartPojo> list = shopcartMapper.selectShopcartPojoByUid(uid);
		changeShopcartPojoList(list);
		return list;
	}

	public void modify(Shopcart cart) {
		shopcartMapper.updateByPrimaryKeySelective(cart);
	}

	public void delete(Integer sid) {
		shopcartMapper.deleteByPrimaryKey(sid);
	}

}
