package com.mouad.Hello_Events.repository;

import com.mouad.Hello_Events.model.Values;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValuesRepo extends JpaRepository<Values, Long> {
}
