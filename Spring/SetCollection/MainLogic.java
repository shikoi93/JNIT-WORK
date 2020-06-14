package com.setter;

import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource res = new ClassPathResource("spconfig.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		Object o = factory.getBean("course");
		Course c =(Course)o;
       Set s=c.getStudentCourse();
       s.forEach(StudentCourse -> System.out.println(StudentCourse));
	}

}
