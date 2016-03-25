package org.crce.interns.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.crce.interns.dao.SearchDao;
import org.crce.interns.model.PersonalProfile;
import org.crce.interns.model.ProfessionalProfile;
import org.crce.interns.model.UserDetails;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class SearchDaoImpl implements SearchDao{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<UserDetails> searchUsers(String searchString) {
		return entityManager.createQuery("select u from UserDetails u where u.userName like :userName").setParameter("userName", "%"+searchString+"%").getResultList();
	}

}
