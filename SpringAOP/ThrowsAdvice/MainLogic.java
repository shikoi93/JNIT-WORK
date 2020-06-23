package com.check;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Logging user=(Logging)factory.getBean("pfb");
		user.validate();
		
		
		
		
	}

}
