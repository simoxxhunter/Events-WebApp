package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.User;
import com.mouad.Hello_Events.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Long countUsers() {
        return userRepository.countUsers();
    }

    @Override
    public User editUser(User user, Long id) {
        User UserToEdit = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id " + id));


        if (user.getFirstName() != null) {
            UserToEdit.setFirstName(user.getFirstName());
        }
        if (user.getLastName() != null) {
            UserToEdit.setLastName(user.getLastName());
        }
        if (user.getEmail() != null) {
            UserToEdit.setEmail(user.getEmail());
        }
        if (user.getPassword() != null) {
            UserToEdit.setPassword(user.getPassword());
        }

        return userRepository.save(UserToEdit);
    }
}
