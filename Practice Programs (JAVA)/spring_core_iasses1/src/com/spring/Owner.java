package com.spring;



public class Owner {
	String name;
	String password;
	public Owner() {
		System.out.println("...Creating an owner...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void display() {
		System.out.println(this.name);
	}
	public void setProperties(String name,String password) {
		
	}

}

