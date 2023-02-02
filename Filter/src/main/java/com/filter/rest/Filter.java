package com.filter.rest;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class Filter {
	public Boolean propertyPresent(Map<String, String> user) {
		for (Map.Entry<String,String> entry : user.entrySet()) {
			if(entry.getKey() == "firstname" && entry.getValue().length() > 0) {
				return true;
			} 
		}
		
		return false;
    }
	
	public Boolean propertyEqual(Map<String, String> user) {
		for (Map.Entry<String,String> entry : user.entrySet()) {
			if(entry.getKey() == "age" && entry.getValue() == "35") {
				return true;
			} 
		}
		
		return false;
    }
	
	public Boolean Operators(Map<String, String> user) {
			if(this.propertyPresent(user) && this.propertyEqual(user)) {
				return true;
			} 
		
		return false;
    }
	
	public String toString(Map<String, String> user) {
		return "if(this.propertyPresent(user) && this.propertyEqual(user)) {\r\n"
				+ "	return true;\r\n"
				+ "}";
	}
}

