package com.Select;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLOutput;


public class MainLogic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Configuration cf = new Configuration();
        cf.configure("configure.xml");

        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();

/*
        Product x = new Product();
        x.setPid(3);
        x.setPname("Bitter Gourd");
        x.setTaste("bitter");


        Transaction tx = se.beginTransaction();
        se.save(x);


        tx.commit();

 */
      Object o= se.get(Product.class,new Integer(1));
       //Object o=se.load(Product.class,3);
       Product p=(Product)o;
       System.out.println(p.getPid()+" "+p.getPname()+" "+p.getTaste());
       p.setTaste("namitho");

     /*
        Product x=new Product();
        x.setPid(4);
        x.setPname("kagati");
        x.setTaste("amilo");
        */

        Transaction tx=se.beginTransaction();
        se.save(p);
       // se.flush();
        //se.equals(x);
        tx.commit();

        se.close();
        sf.close();



    }

}
