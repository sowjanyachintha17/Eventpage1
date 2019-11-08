package com.df.EventPage1.Service;

import java.util.List;



import com.df.EventPage1.ModelClass.EventDetails;


public interface EventService {

	EventDetails saveEventDetails(EventDetails eventdetails);
	List<EventDetails> getAllEventDetails();
}
