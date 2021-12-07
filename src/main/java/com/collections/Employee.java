package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private List<String> phones;
	private Set<String> addresses;
	private Map<Integer, String> courses;
	
	
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<Integer, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<Integer, String> courses) {
		this.courses = courses;
	}
	
	

}
