package com.demo.dao;

import java.sql.SQLException;

import com.demo.entity.UserInfo;
import com.demo.exception.DBConnectionException;
import com.demo.exception.UserDetailedException;

public interface RegistrationDao {
	
	void saveUser(UserInfo userInfo) throws UserDetailedException,DBConnectionException;
	
	UserInfo getCredentials(String userName,String password) throws ClassNotFoundException, SQLException;

}
