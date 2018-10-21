package cn.edu.hbpu.shop.service;

import java.util.List;

import cn.edu.hbpu.shop.pojo.OrderitemPojo;

import com.github.pagehelper.PageInfo;

public interface OrdersService {
	Integer insertOrders(Double total,Integer[] cartIds, Integer uid);
	void updateOrders(Integer oid);
	PageInfo<List<OrderitemPojo>> getOrdersByUid(Integer uid,int page, int row);
	void updateState(Integer oid);
	void deleteOrder(Integer oid);
}
