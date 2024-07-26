package com.mouad.Hello_Events.controller;

import com.mouad.Hello_Events.service.ContactService;
import com.mouad.Hello_Events.service.EventService;
import com.mouad.Hello_Events.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dashbord")
public class DashbordController {

    @Autowired
    private UserService userService;
    @Autowired
    private ContactService contactService;
    @Autowired
    private EventService eventService;

    @GetMapping("/users")
    public Long countUsers(){
        return userService.countUsers();
    }

    @GetMapping("/contacts")
    public Long countContacts(){
        return contactService.countAllContacts();
    }

    @GetMapping("/events")
    public Long countEvents(){
        return eventService.countEvents();
    }
}
