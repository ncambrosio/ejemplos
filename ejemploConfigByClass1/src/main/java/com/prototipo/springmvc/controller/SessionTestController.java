package com.prototipo.springmvc.controller;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.prototipo.springmvc.model.User;

@Controller
@SessionAttributes("myUserSession")
public class SessionTestController {

	@ModelAttribute("myUserSession")
	public User addStuffToRequestScope() {
		System.out.println("Inside of addStuffToRequestScope");
		User bean = new User(1, "noeca", "Arzobispo Gelmírez", "ncambrosio@gmail.com");
		return bean;
	}
 
	@RequestMapping("/presession")
	public String requestHandlingMethod(Model model, HttpServletRequest request, HttpSession session) {
		
		System.out.println("Inside of 'requestHandlingMethod' handler method");
 
		System.out.println("--- Model data ---");
		
		Map<String, Object> modelMap = model.asMap();
		for (Object modelKey : modelMap.keySet()) {
			Object modelValue = modelMap.get(modelKey);
			System.out.println(modelKey + " -- " + modelValue);
		}
 
		System.out.println("=== Request data ===");
		Enumeration<String> reqEnum = request.getAttributeNames();
		while (reqEnum.hasMoreElements()) {
			String s = reqEnum.nextElement();
			System.out.println(s);
			System.out.println("==" + request.getAttribute(s));
		}
 
		System.out.println("*** Session data ***");
		Enumeration<String> e = session.getAttributeNames();
		while (e.hasMoreElements()){
			String s = e.nextElement();
			System.out.println(s);
			System.out.println("**" + session.getAttribute(s));
		}
		
		System.out.println("MAX INACTIVE TIME: " + session.getMaxInactiveInterval());

		return "postsession";
	}
	
	@RequestMapping("/endsession")
	public String nextHandlingMethod2(SessionStatus status){
		status.setComplete();
		return "welcome";
	}
}
