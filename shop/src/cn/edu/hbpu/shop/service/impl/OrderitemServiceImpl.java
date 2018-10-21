package cn.edu.hbpu.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.shop.mapper.OrderitemMapper;
import cn.edu.hbpu.shop.pojo.OrderitemPojo;
import cn.edu.hbpu.shop.pojo.ShopcartPojo;
import cn.edu.hbpu.shop.service.OrderitemService;

@Service
public class OrderitemServiceImpl implements OrderitemService {
	
	@Autowired
	private OrderitemMapper orderitemMapper;
	public List<OrderitemPojo> getOrderItemsByOid(Integer oid) {
		List<OrderitemPojo> list = orderitemMapper.selectOrderitemPojoByOid(oid);
		changeOrderitemPojoList(list);
		return list;
	}
	
	private void changeOrderitemPojoList(List<OrderitemPojo> list){
		for (int i = 0; i < list.size(); i++) {
			OrderitemPojo item = list.get(i);
			String image = item.getImage();
			String[] split = image.split(",");
			item.setImage("/pic/" + split[0]);
		}
	}

}
