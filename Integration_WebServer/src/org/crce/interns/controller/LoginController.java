package org.crce.interns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;
import org.crce.interns.beans.LoginForm;
import org.crce.interns.model.RoleMaster;
import org.crce.interns.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import javax.validation.Valid;

@Controller
public class LoginController {

	@Autowired
	public LoginService loginService;

	@RequestMapping(value = "/Login", method = RequestMethod.GET) 
	public ModelAndView showForm(Map modelMap) {
		LoginForm loginForm = new LoginForm();
		modelMap.put("loginForm", loginForm);
		return new ModelAndView("loginform", modelMap);
	}

	@RequestMapping(value = "/Profile", method = RequestMethod.POST)
	public ModelAndView processForm(@Valid LoginForm loginForm, BindingResult result, Map modelMap) {

		if (result.hasErrors()) {
			return new ModelAndView("loginform", modelMap);
		}

		RoleMaster roleMaster = loginService.checkLogin(loginForm.getUserName(), loginForm.getPassword());
		System.out.println("ROLE:" + roleMaster.getRoleName());
		if (roleMaster.getRoleName().equals("student")) {
			modelMap.put("loginForm", loginForm);
			return new ModelAndView("Student", modelMap);
		} else if (roleMaster.getRoleName().equals("studenttpc")) {
			modelMap.put("loginForm", loginForm);
			return new ModelAndView("StudentTPC", modelMap);
		} else if (roleMaster.getRoleName().equals("tpo")) {
			modelMap.put("loginForm", loginForm);
			return new ModelAndView("TPO", modelMap);
		} else {
			result.rejectValue("userName", "invaliduser");
			return new ModelAndView("loginform", modelMap);
		}
	}

}
