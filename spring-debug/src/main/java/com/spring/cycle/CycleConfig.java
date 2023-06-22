package com.spring.cycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ITender
 * @date: 2023/06/11/ 21:02
 * @desc:
 */
@Configuration
public class CycleConfig {

	@Bean
	public UserService getUserService() {
		return new UserService();
	}

	@Bean
	public OrderService getOrderService() {
		return new OrderService();
	}
}
