package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.demo.entity.UserInfo;
import com.demo.exception.DBConnectionException;
import com.demo.exception.UserDetailedException;
import com.demo.utility.DBUtility;

@Component
public class RegistrationDaoImpl implements RegistrationDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	


	@Override
	public void saveUser(UserInfo userInfo) throws UserDetailedException, DBConnectionException   {
		
		try {
		
		String sql = "insert into UserDetail (UserName,Password,Gender,PhoneNumber,email) "
				+ "values('"+userInfo.getUserName()+"','"+userInfo.getPassword()+"','"+userInfo.getGender()+"','"+userInfo.getPhoneNumber()+"','"+userInfo.getEmail()+"')";
		jdbcTemplate.update(sql);
		
		}catch(DataAccessException ex) {
			
			throw new UserDetailedException(ex.getMessage(), ex);
		}
		
	}

	@Override
	public UserInfo getCredentials(String userName, String password) throws ClassNotFoundException, SQLException {
		
		Connection conn =DBUtility.getConnection();
		String sql = "select * from UserDetail where UserName = ? and Password =?";
		PreparedStatement statement =conn.prepareStatement(sql);
		statement.setString(1, userName);
		statement.setString(2, password);
		
		statement.execute();
		 ResultSet resultset =  statement.getResultSet();
		 UserInfo info = null;
		while(resultset.next()) {
			info = new UserInfo(resultset.getString("UserName"), resultset.getString("Password"), resultset.getString("Gender"), 
					resultset.getString("PhoneNumber"), resultset.getString("email"));
			break;
		}
		return info;
	}

}
