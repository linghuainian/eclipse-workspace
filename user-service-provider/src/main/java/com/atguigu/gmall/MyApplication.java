package com.atguigu.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext iocApplicationContext=new ClassPathXmlApplicationContext("provider.xml");
		iocApplicationContext.start();
		System.in.read();
	}

}
