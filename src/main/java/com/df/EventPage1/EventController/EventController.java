package com.df.EventPage1.EventController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.df.EventPage1.EventRepository.EventRepository;
import com.df.EventPage1.ModelClass.EventDetails;
import com.df.EventPage1.Service.EventService;

@Controller
public class EventController {
	@Autowired
	private EventRepository repo;
	@Autowired
	private EventService service;
	
@RequestMapping("/home")
public String home() {
return "userdetails";
}
@RequestMapping(value="/reg",method = RequestMethod.POST)
	public String saveEventDetails(@ModelAttribute("EventDetails")EventDetails eventdetails,ModelMap modelmap ) {
	EventDetails userdetailsSaved = service.saveEventDetails(eventdetails);
					
		modelmap.addAttribute("msg", "Saved Successfully");
		return "userdetails";
}

@RequestMapping(value="/displayeventDetailslist",method = RequestMethod.GET)
public String displayeventdetailslist(ModelMap modelMap) {
   
    List<EventDetails> event=service.getAllEventDetails();
    modelMap.addAttribute("event", event);
    return "event";
}

//public List<EventDetails> getAllEventDetails() {
//	
//	return EventService.getAllEventDetails();
//}

}
