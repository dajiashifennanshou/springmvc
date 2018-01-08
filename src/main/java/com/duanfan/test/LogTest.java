package com.duanfan.test;


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.duanfan.redis.RedisUtil;

public class LogTest {
	static Logger logger= Logger.getLogger(LogTest.class);
	public static void main(String[] args){
		@SuppressWarnings("resource")  
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");  
		RedisUtil redisUtil=(RedisUtil) context.getBean("redisUtil");
//        redisUtil.set("name", "������");  
//        redisUtil.set("age", 24);  
//        redisUtil.set("address", "�ӱ�����");
        System.out.println(redisUtil.get("name")); 
	}
}
