package org.crce.interns.dao;

import java.util.List;

import org.crce.interns.model.PersonalProfile;
import org.crce.interns.model.ProfessionalProfile;
import org.crce.interns.model.UserDetails;

public interface SearchDao {

	public List<UserDetails> searchUsers(String searchString);
}
