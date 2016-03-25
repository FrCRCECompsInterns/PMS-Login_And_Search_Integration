package org.crce.interns.dao.impl;

import org.crce.interns.dao.LoginDAO;
import org.crce.interns.model.RoleMaster;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class LoginDAOImpl implements LoginDAO{
    
	@PersistenceContext
	private EntityManager entityManager;
	
	public RoleMaster checkLogin(String userName, String userPassword) {
		System.out.println("In Check login...");
		RoleMaster roleMaster = null;
		System.out.println("Before : ");
		try {
			//roleName = (String) entityManager.createQuery("select r.roleName from RoleMaster r where r.roleId = (select u.roleId from UserDetails u where u.userName like :userName and userPassword like :userPassword)").setParameter("userName", userName).setParameter("userPassword", userPassword).getSingleResult();
			roleMaster =  (RoleMaster) entityManager.createQuery("select r from RoleMaster r where r.roleId = (select u.roleId from UserDetails u where u.userName like :userName and userPassword like :userPassword)").setParameter("userName", userName).setParameter("userPassword", userPassword).getSingleResult();
		} catch(javax.persistence.NoResultException e) {
			System.out.println("User Not Authenticated ");
			roleMaster = new RoleMaster();
			roleMaster.setRoleName("Unauthorised");
		}
		System.out.println("After : ");
		return roleMaster;
	}
  }