package com.spring;



public class Event {
	
	int id;
	String eventName;
	Owner eventOrganiser;
	public Event() {
		System.out.println("...Creating a new event...");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Owner getEventOrganiser() {
		return eventOrganiser;
	}
	public void setEventOrganiser(Owner eventOrganiser) {
		this.eventOrganiser = eventOrganiser;
	}
	public void display() {
		System.out.println(id+")"+eventName+" - "+eventOrganiser.getName());
	}
	public void setProperties(String eventName) {
		this.setEventName(eventName);
		
	}

}
