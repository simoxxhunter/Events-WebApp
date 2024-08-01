package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.Event;
import com.mouad.Hello_Events.model.User;
import com.mouad.Hello_Events.model.enums.Role;
import com.mouad.Hello_Events.repository.EventRepository;
import com.mouad.Hello_Events.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class UserServiceImplTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void getAllUsers() {
        User user1 = new User();
        user1.setUserId(1L);
        user1.setFirstName("User 1");

        User user2 = new User();
        user2.setUserId(2L);
        user2.setFirstName("User 2");


        List<User> usersList = Arrays.asList(user1, user2);

        when(userRepository.findAll()).thenReturn(usersList);

        List<User> result = userServiceImpl.getAllUsers();

        assertEquals(2, result.size());
        assertEquals("User 1", result.get(0).getFirstName());
        assertEquals("User 2", result.get(1).getFirstName());

    }
}