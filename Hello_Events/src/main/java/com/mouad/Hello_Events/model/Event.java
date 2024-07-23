package com.mouad.Hello_Events.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    private String title;
    private String description;
    private String location;
    private LocalDate date;  // Changed to LocalDate
    private String category;
    private Double price;
    private int availableTickets;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}
