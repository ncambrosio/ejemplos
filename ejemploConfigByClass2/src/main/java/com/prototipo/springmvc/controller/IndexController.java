package com.prototipo.springmvc.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prototipo.springmvc.util.UtilApp;

@Controller
@RequestMapping(path="/")
public class IndexController {

	@Resource
	UtilApp utilApp;
	
	@Resource 
	String mainPageFromStringBean;
	
	@Value("${main.page}")
	String mainPageFromProperties;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getIndexPage() {
		
		String page = "welcome";
		
		page = utilApp.getDefaultPages().get("main");
		
		page = mainPageFromStringBean;
		
		page = mainPageFromProperties;
		
		return page;
	}
}
