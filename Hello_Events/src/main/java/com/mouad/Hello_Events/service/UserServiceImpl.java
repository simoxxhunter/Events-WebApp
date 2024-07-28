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
        userRepository.findById(id);

        User UserToEdit = new User();
        UserToEdit.setUserId(id);
        UserToEdit.setFirstName(UserToEdit.getFirstName());
        UserToEdit.setLastName(UserToEdit.getLastName());
        UserToEdit.setEmail(UserToEdit.getEmail());
        UserToEdit.setPassword(UserToEdit.getPassword());

        return userRepository.save(UserToEdit);
    }
}
