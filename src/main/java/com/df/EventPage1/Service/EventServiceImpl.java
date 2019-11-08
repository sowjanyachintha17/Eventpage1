package com.df.EventPage1.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.df.EventPage1.EventRepository.EventRepository;
import com.df.EventPage1.ModelClass.EventDetails;
@Service
public class EventServiceImpl implements EventService{

	@Autowired
	EventRepository repo;

	@Override
	public EventDetails saveEventDetails(EventDetails eventdetails) {
		
		return repo.save(eventdetails);
	}

	@Override
	public List<EventDetails> getAllEventDetails() {
		
		return repo.findAll();
	}
	

}
