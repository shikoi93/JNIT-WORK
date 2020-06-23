package com.exLog;

import org.apache.log4j.Logger;

public class Sample {
	static Logger log=Logger.getLogger(Sample.class.getName());
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("This is a debug message.");
		log.info("This is information.");
		log.warn("This is warning.");
		log.trace("This is tracing");
		log.error("This is a error");
		log.fatal("This is fatal.");
		
		System.out.println("Logging Example");
		
	}

}
