package com.hsbc.banking.dao.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.hsbc.banking.models.Event;


public interface EventDao {
	boolean addEvent(Event event)throws SQLException;
	Event getEventById(long eventId)throws SQLException;
	List<Event> getAllEvents()throws SQLException;
}
