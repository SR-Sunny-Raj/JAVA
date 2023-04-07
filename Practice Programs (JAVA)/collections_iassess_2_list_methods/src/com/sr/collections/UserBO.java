package com.sr.collections;
import java.util.*;
public class UserBO extends ArrayList<User>{
	public void removeUser(int n1,int n2) {
		this.removeRange(n1, n2);
	}
	
	public static UserBO getList() {
		UserBO uboObj = new UserBO();
		uboObj.add(new User("mohan Raja","9874563210","mohan","mohan@abc.in"));
		uboObj.add(new User("arjun Ravi","4324237","arjun","arjun@abc.in"));
		uboObj.add(new User("Arun kumar","9845671230","arun","arun@abc.in"));
		uboObj.add(new User("prakash raj","7548921445","prakash","raj@abc.in"));
		return uboObj;                                                                                                                                                                                                                 
	}
}
