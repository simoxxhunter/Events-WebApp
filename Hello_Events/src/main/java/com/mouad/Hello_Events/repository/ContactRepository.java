package com.mouad.Hello_Events.repository;

import com.mouad.Hello_Events.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    @Query(value = "SELECT count(*)FROM Contact")
    Long countAllByContacts();
}
