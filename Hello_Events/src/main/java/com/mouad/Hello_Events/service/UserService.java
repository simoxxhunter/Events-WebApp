package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.User;

import java.util.List;

public interface UserService {
     List<User> getAllUsers();
     void deleteUser(Long id);
     Long countUsers();
     User editUser(User user, Long id);
}
