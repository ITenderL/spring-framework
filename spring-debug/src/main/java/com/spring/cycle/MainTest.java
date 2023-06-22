package com.spring.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: ITender
 * @date: 2023/06/11/ 21:00
 * @desc:
 */
public class MainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CycleConfig.class);
		UserService userService = (UserService)applicationContext.getBean("userService");
		OrderService orderService = (OrderService)applicationContext.getBean("orderService");
	}
}
