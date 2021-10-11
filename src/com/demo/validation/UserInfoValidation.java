package com.demo.validation;

import com.demo.entity.UserInfo;
import com.demo.exception.ValidationException;

public class UserInfoValidation {
	
	public void validateUserInfo(UserInfo info) throws ValidationException {
		/*if(info.getUserName()!=null && info.getUserName().isEmpty() || !info.getUserName().matches("^[a-zA-Z]*$")) {
			throw new ValidationException("UserName should not be empty and should be alphabetical");
		}*/
	}

}
