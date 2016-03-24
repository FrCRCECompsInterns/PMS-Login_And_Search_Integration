package org.crce.interns.dao;

import org.crce.interns.model.RoleMaster;

public interface LoginDAO{    
	public RoleMaster checkLogin(String userName, String userPassword);
}