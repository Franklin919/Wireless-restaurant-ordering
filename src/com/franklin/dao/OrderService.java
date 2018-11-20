package com.franklin.dao;

import java.util.List;

public class OrderService {
	// 生成订单
	public boolean saveOrderInfo(List<String> foodNames, int tableNo) {
		OrderDao dao = new OrderDao();
		boolean result1 = false;
		boolean result2 = false;
//		新增订单
		Order order = new Order();
		order.setTableNo(tableNo);
		result1 = dao.insertOrder(order);
		System.out.println("新增订单结果:" + result1);

//		新增订单明细
		for (String foodName : foodNames) {
			OrderDetail orderDetail = new OrderDetail();
			orderDetail.setOrderId(order.getId());
			orderDetail.setFoodName(foodName);
			orderDetail.setFoodPrice(20.9);
			orderDetail.setFoodCount(1);
			result2 = dao.insertOrderDetail(orderDetail);
			System.out.println("新增订单明细结果:" + result2);
		}

		// 返回新增订单与订单明细的结果
		if (!result2) {
			return false;
		} else {
			return result1 && result2;
		}
	}
}
