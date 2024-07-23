package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.Event;

import java.util.List;

public interface EventService {
    Event createEvent(Event event);
    List<Event> getAllEvents();
    Event editEvent(Event event, Long id);
    void deleteEvent(Long id);
}
