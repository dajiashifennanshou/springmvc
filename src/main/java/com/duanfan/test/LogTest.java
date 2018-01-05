package com.duanfan.test;


import org.apache.log4j.Logger;

public class LogTest {
	static Logger logger= Logger.getLogger(LogTest.class);
	public static void main(String[] args){
		logger.info("infomessage");
		logger.warn("warnmessage");
		logger.debug("debugmessage");
		logger.error("errormessage");
		logger.fatal("fatalmessage");
	}
}
