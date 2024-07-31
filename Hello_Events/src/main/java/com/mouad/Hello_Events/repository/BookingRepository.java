package com.mouad.Hello_Events.repository;

import com.mouad.Hello_Events.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
