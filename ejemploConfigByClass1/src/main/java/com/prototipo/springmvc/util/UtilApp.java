package com.prototipo.springmvc.util;

import java.util.HashMap;

public class UtilApp {

	public void init() {
		System.out.println("Invocado init method!!!");
	}
	
	private HashMap<String, String> defaultPages = new HashMap<String, String>();

	public HashMap<String, String> getDefaultPages() {
		return defaultPages;
	}

	public void setDefaultPages(HashMap<String, String> defaultPages) {
		this.defaultPages = defaultPages;
	}
}
