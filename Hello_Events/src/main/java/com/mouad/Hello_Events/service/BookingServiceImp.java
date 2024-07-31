package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.Booking;
import com.mouad.Hello_Events.model.Event;
import com.mouad.Hello_Events.model.User;
import com.mouad.Hello_Events.repository.BookingRepository;
import com.mouad.Hello_Events.repository.EventRepository;
import com.mouad.Hello_Events.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookingServiceImp {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private UserRepository userRepository;

    public Booking bookTicket(Long userId, Long eventId, int ticketsNumber) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with id " + userId));
        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found with id " + eventId));

        if (event.getAvailableTickets() < ticketsNumber) {
            throw new RuntimeException("Not enough tickets available");
        }

        Booking booking = new Booking();
        booking.setBookingDate(LocalDate.now());
        booking.setTicketsNumber(ticketsNumber);
        booking.setUser(user);
        booking.setEvent(event);

        event.setAvailableTickets(event.getAvailableTickets() - ticketsNumber);
        eventRepository.save(event);

        return bookingRepository.save(booking);
    }
}
