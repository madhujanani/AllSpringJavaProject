package org.training.web.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.training.web.model.UserCredentials;
import org.training.web.model.UserCredentialsMapper;
@Component
public class UserCredentialsDAOImpl implements UserCredentialsDAO {
	JdbcTemplate jdbcTemp;
	private final String SQL_RETRIEVE_USER_CREDENTIALS="select * from USER_CREDENTIALS";
	private final String  SQL_RETRIEVE_WITHID="  where Id=?";
	private final String SQL_ONLY_ID=SQL_RETRIEVE_USER_CREDENTIALS+SQL_RETRIEVE_WITHID;
	 private final int[]  intTypeValue  = {4};
	 
	@Autowired
	public  UserCredentialsDAOImpl( DataSource ds) {
		jdbcTemp = new JdbcTemplate(ds);
		
	}
	@Override
	public UserCredentials getUserNameById(int id) {
		// TODO Auto-generated method stub
		 return jdbcTemp.query( SQL_ONLY_ID, new Object[] {id }, intTypeValue, new UserCredentialsMapper()).get(0);
	}
	@Override
	public List<UserCredentials> getAllUsers() {
		// TODO Auto-generated method stub
		return jdbcTemp.query(SQL_RETRIEVE_USER_CREDENTIALS,  new UserCredentialsMapper());	}

}
