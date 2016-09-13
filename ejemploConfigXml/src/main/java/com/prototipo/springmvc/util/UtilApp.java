package com.prototipo.springmvc.util;

import java.util.HashMap;

public class UtilApp {

	public void initMethod() {
		System.out.println("Invocado init method!!!");
	}
	
	private HashMap<String, String> relaciones = new HashMap<String, String>();

	public HashMap<String, String> getRelaciones() {
		return relaciones;
	}

	public void setRelaciones(HashMap<String, String> relaciones) {
		this.relaciones = relaciones;
	}
}
