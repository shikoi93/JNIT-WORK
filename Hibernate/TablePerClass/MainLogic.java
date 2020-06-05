package com.table;


import com.table.CreditCard;
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

        //CreditCard c = new CreditCard();
        CreditCard x=new CreditCard();
        x.setPid(16);
        x.setAmount(70000);
        x.setCreditCardType("loan");

        Cheque c = new Cheque();
        c.setPid(15);
        c.setAmount(60000);
        c.setChequeType("NRB");



        Transaction tx=se.beginTransaction();
        se.save(x);
        se.save(c);
        // se.flush();
        //se.equals(x);
        tx.commit();

        se.close();
        sf.close();



    }

}
