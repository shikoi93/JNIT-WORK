package com.playersInc;



import java.util.Iterator;
import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.playersInc.PlayersDAO;


@Repository("playersDAO")
public class PlayersDAOImpl implements PlayersDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public boolean savePlayers(Players players) {
		Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		int id = (Integer)se.save(players);
		tx.commit();
		se.close();
		if(id>0)
			return true;
		return false;
	}
	public Players getPlayersDetailsByEmailAndPassword(String email,String password){
	
		Session se=sessionFactory.openSession();
		Query qry = se.createQuery("from Players pt where pt.email= ? and pt.password=?");
        qry.setParameter(0,email);
        qry.setParameter(1, password);

		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		Iterator it = l.iterator();
		if(it.hasNext())
		{
			Object o = (Object) it.next();
			Players p = (Players)o;
			 return p;
		}
		else
		 return null;
	}
	
	}
