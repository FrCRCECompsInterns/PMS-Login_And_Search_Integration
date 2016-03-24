package org.crce.interns.service;

import org.crce.interns.dao.*;
import org.crce.interns.model.RoleMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;

	public RoleMaster checkLogin(String userName, String userPassword) {
		System.out.println("Service Layer.....");
		return loginDAO.checkLogin(userName, userPassword);
	}
}