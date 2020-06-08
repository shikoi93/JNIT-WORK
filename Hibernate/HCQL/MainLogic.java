package com.hib;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import static oracle.net.aso.C11.h;
import static oracle.net.aso.C11.o;


public class MainLogic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Configuration cf = new Configuration();
        cf.configure("configure.xml");

        SessionFactory sf = cf.buildSessionFactory();
        Session se = sf.openSession();
        Criteria c= se.createCriteria(mountain.class);
        c.add(Restrictions.gt("mid",6));
        List li = c.list();
        Iterator l = li.iterator();
/*
insert//
        Himalaya x = new Himalaya();
        x.setHno(1);
        x.setHname("Everest");
        x.setCountry("Nepal");

        x.setHno(2);
        x.setHname("K2");
        x.setCountry("Pakistan");

        x.setHno(3);
        x.setHname("Kanchenjunga");
        x.setCountry("Nepal");

        //Query qr = se.createQuery("delete from Himalaya h where h.hno=:give ");
        //insert into himalaya(hno,hname,country)select mid,mname,country from mountain where mid=101;

        //>> HCQL
        //Query qr = se.createQuery("from Himalaya h where h.hname='e%'");
        //Query qr = se.createQuery("insert into Himalaya(hno,hname,country) select mid,mname,country from mountain where mid=:give ");
        //Query qr = se.createQuery("update Himalaya h set h.hname=:value where h.hno=:give ");
       // qr.setParameter("value","Annapurna");
       // qr.setParameter("give",3);
       // qr.setParameter("give",102);
       // qr.executeUpdate();
        //Query qr = se.createQuery("from Himalaya");
        //Query qr = se.createQuery("select h.hno,h.hname,h.country from Himalaya h");
        //Query qr = se.createQuery("select h.hno from Himalaya h");
        List l = qr.list();
        Iterator li = l.iterator();
        */
        while (l.hasNext()) {
            //Integer o = (Integer)li.next();
            //System.out.println(o.intValue());
            //Object[] o = (Object[]) li.next();
            //System.out.println(o[0]+"   "+o[1]+"  "+o[2]);
            Object o = (Object)l.next();
            mountain h=(mountain)o;
            System.out.println(h.getMid()+"  "+h.getMname()+"  "+h.getCountry());
            //System.out.println(h.getMid()+"  "+h.get);
 }



        Transaction tx = se.beginTransaction();
        //se.save();

        tx.commit();
        se.close();
        sf.close();



    }

}






