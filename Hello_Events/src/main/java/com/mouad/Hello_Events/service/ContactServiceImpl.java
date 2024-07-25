package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.Contact;
import com.mouad.Hello_Events.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> getAllContacts() {
       return contactRepository.findAll();
    }

    @Override
    public Long countAllContacts() {
        return contactRepository.countAllByContacts();
    }
}
