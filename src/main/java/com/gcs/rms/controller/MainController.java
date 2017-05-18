package com.gcs.rms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gcs.rms.model.User;
import com.gcs.rms.service.IAcccountService;



@Controller
public class MainController {
	@Autowired
	IAcccountService iAcccountService;
	@RequestMapping(value={"/"})
	ModelAndView home(){
		List<User> listUsers = iAcccountService.getAllUsers();
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("listUsers", listUsers);
		return modelAndView;
	}
}