package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getAllContacts();
    Long countAllContacts();

}
