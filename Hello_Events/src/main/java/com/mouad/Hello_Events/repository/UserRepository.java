package com.mouad.Hello_Events.repository;

import com.mouad.Hello_Events.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByEmail(String email);

    @Query(value = "select count (*) from User")
    Long countUsers();

}
