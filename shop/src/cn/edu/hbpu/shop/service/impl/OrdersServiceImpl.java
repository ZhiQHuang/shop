package cn.edu.hbpu.shop.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hbpu.shop.mapper.OrderitemMapper;
import cn.edu.hbpu.shop.mapper.OrdersMapper;
import cn.edu.hbpu.shop.mapper.ShopcartMapper;
import cn.edu.hbpu.shop.pojo.Orderitem;
import cn.edu.hbpu.shop.pojo.OrderitemExample;
import cn.edu.hbpu.shop.pojo.OrderitemPojo;
import cn.edu.hbpu.shop.pojo.Orders;
import cn.edu.hbpu.shop.pojo.OrdersExample;
import cn.edu.hbpu.shop.pojo.Shopcart;
import cn.edu.hbpu.shop.service.OrdersService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	private OrdersMapper ordersMapper;
	@Autowired
	private ShopcartMapper shopcartMapper;
	@Autowired
	private OrderitemMapper orderitemMapper;
	
	public Integer insertOrders(Double total, Integer[] cartIds, Integer uid) {
		Orders orders = new Orders();
		orders.setUid(uid);
		orders.setTotal(total);
		orders.setOrdertime(new Date());
		orders.setState(0);
		orders.setStatus(0);
		ordersMapper.insert(orders);
		Integer oid = orders.getOid();
		for(int i = 0; i < cartIds.length; i++){
			Shopcart shopcart = shopcartMapper.selectByPrimaryKey(cartIds[i]);
			Orderitem orderitem = new Orderitem();
			orderitem.setCount(shopcart.getCount());
			orderitem.setPid(shopcart.getPid());
			orderitem.setSubtotal(shopcart.getSubtotal());
			orderitem.setOid(oid);
			orderitemMapper.insert(orderitem);
			
			shopcartMapper.deleteByPrimaryKey(cartIds[i]);
		}
		return oid;
	}

	public void updateOrders(Integer oid) {
		Orders orders = ordersMapper.selectByPrimaryKey(oid);
		orders.setState(1);
		ordersMapper.updateByPrimaryKeySelective(orders);
	}

	public PageInfo<List<OrderitemPojo>> getOrdersByUid(Integer uid, int page,
			int row) {
		PageHelper.startPage(page, row);
		OrdersExample example = new OrdersExample();
		example.createCriteria().andUidEqualTo(uid);
		example.setOrderByClause("oid desc");
		List<Orders> ordersList = ordersMapper.selectByExample(example);
		PageInfo<Orders> pageInfo1 = new PageInfo<Orders>(ordersList);
		List<List<OrderitemPojo>> list = new ArrayList<List<OrderitemPojo>>();
		for (Orders orders : pageInfo1.getList()) {
			List<OrderitemPojo> orderitemList = orderitemMapper.selectOrderitemPojoByOid(orders.getOid());
			for (OrderitemPojo orderitem : orderitemList) {
				String image = orderitem.getImage();
				String[] split = image.split(",");
				orderitem.setImage("/pic/"+split[0]);
				orderitem.setOrdertime(orders.getOrdertime());
				orderitem.setTotal(orders.getTotal());
				String number = orders.getNumber();
				if(number == null) number="无";
				orderitem.setNumber(number);
				Integer state = orders.getState();
				String a = "";
				if (state == 0) {
					a = "未付款";
				}else if (state == 1) {
					a = "已付款（未发货）";
				}else if (state == 2) {
					a = "已发货";
				}else if (state == 3) {
					a = "已收货";
				}else if (state == 4) {
					a = "交易成功";
				}
				orderitem.setState(a);
 			}
			list.add(orderitemList);
		}
		PageInfo<List<OrderitemPojo>> pageInfo = new PageInfo<List<OrderitemPojo>>(list);
		pageInfo.setPages(pageInfo1.getPages());
		pageInfo.setTotal(pageInfo1.getTotal());
		pageInfo.setHasNextPage(pageInfo1.isHasNextPage());
		pageInfo.setHasPreviousPage(pageInfo1.isHasPreviousPage());
		return pageInfo;
	}

	public void updateState(Integer oid) {
		Orders orders = ordersMapper.selectByPrimaryKey(oid);
		orders.setState(3);
		ordersMapper.updateByPrimaryKeySelective(orders);
	}

	public void deleteOrder(Integer oid) {
		
		OrderitemExample example1 = new OrderitemExample();
		example1.createCriteria().andOidEqualTo(oid);
		orderitemMapper.deleteByExample(example1);
		
		OrdersExample example = new OrdersExample();
		example.createCriteria().andOidEqualTo(oid);
		ordersMapper.deleteByExample(example);
	}

}










