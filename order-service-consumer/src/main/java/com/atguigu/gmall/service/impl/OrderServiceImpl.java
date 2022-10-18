package com.atguigu.gmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;

public class OrderServiceImpl implements OrderService{

	@Autowired
	UserService userService;

	public void initOrder(String userId) {
		// TODO Auto-generated method stub
			System.out.println(userService.getUserAddressList(userId));	
		
	}
	
	
	
}
