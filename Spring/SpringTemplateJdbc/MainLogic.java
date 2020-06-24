package com.jdbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource rs = new ClassPathResource("springconfig.xml");
		
		BeanFactory factory =  new XmlBeanFactory(rs);
		BookD x=(BookD)factory.getBean("books");
	/*	
		ApplicationContext ac = new ClassPathXmlApplicationContext("springconfig.xml");
		BookD x = (BookD)ac.getBean("books");    
			x.getAll();
		*/
		Books bs = new Books();
		bs.setId(1);
		bs.setName("The Alchemist");
		bs.setGenre("Fiction");
		bs.setLambai(1000);
		int k = x.insertBooks(bs);
		if(k!=0)
			System.out.println("Record Inserted");
		
/*	// update	
		Books bs = new Books();
		bs.setId(1);
		bs.setName("The Book Theif");
		bs.setGenre("Fiction");
		bs.setLambai(100);
		int k = x.updateBooks(bs);
		if(k!=0)
			System.out.println("Record Updated");
		
	
		Books bs = new Books();
		bs.setId(1);
		
		int k = x.deleteBooks(bs);
		if(k!=0)
			System.out.println("Record Deleted");
	
		Books bs = new Books();
		bs.setId(2);
		bs.setName("In Cold Blood");
		bs.setGenre("Non Fiction");
		bs.setLambai(1500);
		Boolean b = x.insertBooks(bs);
		if(b)
			System.out.println("Record Inserted");
	
		
		Books bs = new Books();
		bs.setId(2);
		bs.setName("Crime");
		bs.setGenre("Non Fiction");
		bs.setLambai(1200);
		Boolean b = x.updatetBooks(bs);
		if(b)
			System.out.println("Record Updated");
*/
/*
		Books bs = new Books();
		bs.setId(2);
		bs.setName("Crime");
		bs.setGenre("Non Fiction");
		bs.setLambai(1200);
		Boolean b = x.deletetBooks(bs);
		if(b)
			System.out.println("Record Delete");
			*/

}
}