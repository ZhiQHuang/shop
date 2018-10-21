package cn.edu.hbpu.shop.service;

import java.util.List;

import cn.edu.hbpu.shop.pojo.OrderitemPojo;

public interface OrderitemService {
	List<OrderitemPojo> getOrderItemsByOid(Integer oid);
}
