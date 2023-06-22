package com.spring.cycle;

import org.springframework.stereotype.Service;

/**
 * @author: ITender
 * @date: 2023/06/11/ 20:54
 * @desc:
 */
@Service
public class OrderService {

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
