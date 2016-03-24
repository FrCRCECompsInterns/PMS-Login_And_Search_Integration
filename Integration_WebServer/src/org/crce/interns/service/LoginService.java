package org.crce.interns.service;

import org.crce.interns.model.RoleMaster;
import org.springframework.stereotype.Service;

@Service
public interface LoginService{    
	public RoleMaster checkLogin(String userName, String userPassword);
}