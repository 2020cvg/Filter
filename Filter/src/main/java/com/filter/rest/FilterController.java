package com.filter.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterController {
	
	@Autowired
	Filter filter;
	
	@GetMapping("/resource")
	public Boolean resourceFilter() {
	    Boolean match = false;
	    Map<String, String> user = new LinkedHashMap<String, String>();
	    user.put("firstname", "Joe");
	    user.put("surname", "Bloggs");
	    user.put("role", "administrator");
	    user.put("age", "35");
	    
//	    match = filter.propertyPresent(user);
//	    match = filter.propertyEqual(user);
	    match = filter.Operators(user);
	    
	    return match;
	}
	
	@GetMapping("/toString")
	public String toStringFilter() {
	    String result = "";
	    Map<String, String> user = new LinkedHashMap<String, String>();
	    user.put("firstname", "Joe");
	    user.put("surname", "Bloggs");
	    user.put("role", "administrator");
	    user.put("age", "35");
	    
	    result = filter.toString(user);
	    
	    return result;
	}
	
}








