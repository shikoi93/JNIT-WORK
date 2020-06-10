package com.first;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class MainLogic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Configuration cf = new Configuration();
        cf.configure("configure.xml");

        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();


        Studentss x = new Studentss();
        x.setSid(1025);
        x.setSname("Shiva");
        x.setMarks(585);


        Transaction tx = se.beginTransaction();
        se.save(x);

        tx.commit();
        se.close();
        sf.close();



    }

}






