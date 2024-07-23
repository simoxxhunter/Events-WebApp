package com.mouad.Hello_Events.controller;

import com.mouad.Hello_Events.model.Event;
import com.mouad.Hello_Events.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PutMapping
    public Event updateEvent(@RequestBody Event event, @PathVariable Long id) {
        return eventService.editEvent(event, id);
    }

    @DeleteMapping
    public void deleteEvent(@PathVariable Long id) {
        eventService.deleteEvent(id);
    }
}
