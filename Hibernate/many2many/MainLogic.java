package com.many2many;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class MainLogic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Configuration cf = new Configuration();
        cf.configure("configure.xml");

        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();


        Student s1 = new Student();
        s1.setSid(98);
        s1.setSname("Shyam");
        s1.setMarks(12);


        Student s2 = new Student();
        s2.setSid(106);
        s2.setSname("Kes");
        s2.setMarks(800);

        Student s3 = new Student();
        s3.setSid(107);
        s3.setSname("Arjuna");
        s3.setMarks(808);

        Course c = new Course();
        c.setCid(001);
        c.setCname("Physics");
        c.setDuration(500);

        Course c1 = new Course();
        c1.setCid(002);
        c1.setCname("Maths");
        c1.setDuration(501);

        Course c2 = new Course();
        c2.setCid(003);
        c2.setCname("English");
        c2.setDuration(502);





        Transaction tx = se.beginTransaction();
        Set s = new HashSet();
        s.add(c);
        Set k = new HashSet();

        k.add(c1);
        s.add(c2);

        s1.setCourses(s);
        s2.setCourses(s);
        s3.setCourses(s);


        se.save(s1);
        se.save(s2);
        se.save(s3);

        tx.commit();


        se.close();
        sf.close();



    }

}


















