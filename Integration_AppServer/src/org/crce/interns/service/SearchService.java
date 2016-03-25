package org.crce.interns.service;

import java.util.List;

import org.crce.interns.model.PersonalProfile;
import org.crce.interns.model.ProfessionalProfile;
import org.crce.interns.model.UserDetails;

public interface SearchService {

	public List<UserDetails> searchUsers(String searchString);
}
