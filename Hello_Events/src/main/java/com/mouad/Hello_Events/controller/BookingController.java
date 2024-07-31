package com.mouad.Hello_Events.controller;

import com.mouad.Hello_Events.model.Booking;
import com.mouad.Hello_Events.service.BookingServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingServiceImp bookingService;

    @PostMapping("/book")
    public Booking bookTicket(@RequestParam Long userId, @RequestParam Long eventId, @RequestParam int ticketsNumber) {
        return bookingService.bookTicket(userId, eventId, ticketsNumber);
    }
}
