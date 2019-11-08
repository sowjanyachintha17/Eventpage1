package com.df.EventPage1.EventRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.df.EventPage1.ModelClass.EventDetails;

@Repository
public interface EventRepository extends MongoRepository<EventDetails,String>{

}
