package org.crce.interns.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.crce.interns.model.PersonalProfile;
import org.crce.interns.model.ProfessionalProfile;
import org.crce.interns.model.UserDetails;
import org.crce.interns.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

	@Autowired
	private SearchService searchService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public ModelAndView welcomeSearch() {
		return new ModelAndView("searchbar");
	}
	
	@RequestMapping(value = "/Search", method = RequestMethod.GET) 
	public ModelAndView search(@RequestParam("searchString")String searchString) {
		System.out.println(searchString);
		List<UserDetails> userDetailsList = searchService.searchUsers(searchString);
		System.out.println(userDetailsList.get(0).getUserName());
		Map<String, Object> modelMap = new HashMap<>();
		modelMap.put("userList", userDetailsList);
		return new ModelAndView("searchbar", modelMap);
	}
}
