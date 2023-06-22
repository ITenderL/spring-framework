package com.spring.cycle;

import org.springframework.stereotype.Service;

/**
 * @author: ITender
 * @date: 2023/06/11/ 20:54
 * @desc:
 */
@Service
public class UserService {

	private OrderService orderService;

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
}
