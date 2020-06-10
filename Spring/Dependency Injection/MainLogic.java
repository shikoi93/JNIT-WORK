package com.dependency;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource res = new ClassPathResource("spconfig1.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
		Resource res1 = new ClassPathResource("spconfig2.xml");
		 
		BeanFactory f = new XmlBeanFactory(res1,factory);
		
		Object o = f.getBean("tv");
		Travel t = (Travel)o;
		t.startJourney();
		
		
	}

}
