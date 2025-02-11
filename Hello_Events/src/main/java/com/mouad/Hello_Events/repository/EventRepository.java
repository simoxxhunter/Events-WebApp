package com.mouad.Hello_Events.repository;

import com.mouad.Hello_Events.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    @Query(value = "select count (*) from Event")
    Long countAllEvents();
}
