package com.mouad.Hello_Events.controller;

import com.mouad.Hello_Events.model.Event;
import com.mouad.Hello_Events.model.User;
import com.mouad.Hello_Events.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("/edit/{id}")
    public User editUser(@RequestBody User user, @PathVariable long id) {
        return userService.editUser(user,id);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
    }
}
