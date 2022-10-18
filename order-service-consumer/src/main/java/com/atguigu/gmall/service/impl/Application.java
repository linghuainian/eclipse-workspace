package com.atguigu.gmall.service.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext iocApplicationContext=new ClassPathXmlApplicationContext("consumer.xml");
		iocApplicationContext.start();
		OrderServiceImpl orderServiceImpl=new OrderServiceImpl();
		orderServiceImpl.initOrder("1");
		System.in.read();
	}
}
