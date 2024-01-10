package org.training.web.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserCredentialsMapper implements RowMapper<UserCredentials> {

	@Override
	public UserCredentials mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		UserCredentials usc = new UserCredentials();
		usc.setId(rs.getInt("ID"));
		usc.setUserName(rs.getString("USERNAME"));
		usc.setPassword(rs.getString("PASWORD"));
		return usc;
	}

}
