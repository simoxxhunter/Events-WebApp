package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.Booking;

public interface BookingService {
    Booking bookTicket(Long userId, Long eventId, int ticketsNumber);
}
