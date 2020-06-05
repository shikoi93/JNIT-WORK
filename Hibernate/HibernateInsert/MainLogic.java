package com.fhibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf = new Configuration();
		cf.configure("configure.xml");

		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		
		
		Student x = new Student();
		x.setSid(3);
		x.setName("Keshab");
		x.setAddress("USA");
		
		//x.setSid(2);
		//x.setName("Arjun");
		//x.setAddress("atlanta");
		
		
		//x.setSid(1);
		//x.setName("pratik");
		//x.setAddress("euless");
		
		Transaction tx = se.beginTransaction();
		se.delete(x);
		
		tx.commit();
		se.close();
		sf.close();
		
		
		
	}

}
