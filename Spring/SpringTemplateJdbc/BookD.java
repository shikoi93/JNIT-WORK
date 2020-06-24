package com.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class BookD {

private JdbcTemplate jdbcTemplate;	
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
	
}
/*
public void getAll() {
	List l = jdbcTemplate.queryForList("select * from books");
	Iterator i = l.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
*/
public int insertBooks(Books bs) {
	String query = "insert into Books values("+bs.getId()+",'"+bs.getName()+"','"+bs.getGenre()+"',"+bs.getLambai()+")";
	int x = jdbcTemplate.update(query);
	return x;
	
}
/*
public int updateBooks(Books bs) {
	String sql="update books set bookName='"+bs.getName()+"',bookGenre='"+bs.getGenre()+"',lambai="+bs.getLambai()+" where id="+bs.getId()+"";
	
	int x = jdbcTemplate.update(sql);
	return x;
	
}
public int deleteBooks(Books bs) {
	String query="delete from books where id="+bs.getId()+"";
	int x = jdbcTemplate.update(query);
	return x;
}
}
*/
public boolean insertBooks(final Books bs) {
	//String query="insert into books values(?,?,?,?)";
	
	String query = "delete from books where id = ?";
	//jdbcTemplateObject.update(deleteQuery, id);
	
	jdbcTemplate.execute(query, new PreparedStatementCallback<Boolean>() {
	
		
		public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			ps.setInt(1,bs.getId());
			ps.setString(2,bs.getName());
			ps.setString(3,bs.getGenre());
			ps.setInt(4, bs.getLambai());
			
			return ps.execute();
		}
	});
	
	return true;
}
/*
public boolean updatetBooks(final Books bs) {
	String Query = "update books set bookName=?,bookGenre=?,lambai=? where id = ?";
	jdbcTemplate.execute(Query, new PreparedStatementCallback<Boolean>() {
		@Override
		public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			ps.setString(1,bs.getName());
			ps.setString(2,bs.getGenre());
			ps.setInt(3,bs.getLambai());	
			ps.setInt(4,bs.getId());
			
			
			return ps.execute();
		}
	
	});
		return true;
	}
	*/

/*
public boolean deletetBooks(final Books bs) {
	String Query = "delete from books where id = ?";
	jdbcTemplate.execute(Query, new PreparedStatementCallback<Boolean>() {

		@Override
		public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			//ps.setString(1,bs.getName());
			//ps.setString(2,bs.getGenre());
			//ps.setInt(3,bs.getLambai());	
			ps.setInt(1,bs.getId());

			
			
			return ps.execute();
		}
	
	});
		return true;
		*/
	}
