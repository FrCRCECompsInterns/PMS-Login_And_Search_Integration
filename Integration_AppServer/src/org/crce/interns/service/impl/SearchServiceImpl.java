package org.crce.interns.service.impl;

import java.util.List;

import org.crce.interns.dao.SearchDao;
import org.crce.interns.model.PersonalProfile;
import org.crce.interns.model.ProfessionalProfile;
import org.crce.interns.model.UserDetails;
import org.crce.interns.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImpl implements SearchService{

	@Autowired
	private SearchDao searchDao;

	@Override
	public List<UserDetails> searchUsers(String searchString) {
		
		return searchDao.searchUsers(searchString);
	}

}
