package com.hsbc.banking.models;

import java.sql.Time;
import java.time.LocalDate;

public class Event {

	private long eventId;
	private String name;
	private LocalDate eventDate;
	private Time eventTime;
	private int capacity;
	public long getEventId() {
		return eventId;
	}
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	public Time getEventTime() {
		return eventTime;
	}
	public void setEventTime(Time eventTime) {
		this.eventTime = eventTime;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
