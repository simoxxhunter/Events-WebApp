package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.Event;
import com.mouad.Hello_Events.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event editEvent(Event event, Long id) {
        eventRepository.findById(id);

        Event editedEvent = new Event();
        editedEvent.setEventId(id);
        editedEvent.setDate(event.getDate());
        editedEvent.setCategory(event.getCategory());
        editedEvent.setBookings(event.getBookings());
        editedEvent.setDescription(event.getDescription());
        editedEvent.setPrice(event.getPrice());
        editedEvent.setLocation(event.getLocation());
        editedEvent.setAvailableTickets(event.getAvailableTickets());

        return eventRepository.save(editedEvent);
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
