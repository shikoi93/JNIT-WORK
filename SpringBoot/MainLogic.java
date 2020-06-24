package com.sendMail;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		LogicToSendMail user = (LogicToSendMail)factory.getBean("ml");
		user.sendM("sivakoirala0@gmail.com","Test Mail", "Spring program sent a mail");
		
	}

}
