package com.df.EventPage1.ModelClass;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EventDetails
{
	@Id
	private String id;
private String date;
private String eventName;
private String aboutEvent;
private String eventDateTime;
private String location;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getEventName() {
	return eventName;
}
public void setEventName(String eventName) {
	this.eventName = eventName;
}
public String getAboutEvent() {
	return aboutEvent;
}
public void setAboutEvent(String aboutEvent) {
	this.aboutEvent = aboutEvent;
}
public String getEventDateTime() {
	return eventDateTime;
}
public void setEventDateTime(String eventDateTime) {
	this.eventDateTime = eventDateTime;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "EventDetails [id=" + id + ", date=" + date + ", eventName=" + eventName + ", aboutEvent=" + aboutEvent
			+ ", eventDateTime=" + eventDateTime + ", location=" + location + "]";
}


}
