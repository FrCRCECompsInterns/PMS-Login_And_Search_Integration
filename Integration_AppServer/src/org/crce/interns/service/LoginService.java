package org.crce.interns.service;

import org.crce.interns.model.RoleMaster;

public interface LoginService{    
	public RoleMaster checkLogin(String userName, String userPassword);
}