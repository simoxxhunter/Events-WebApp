package com.mouad.Hello_Events.repository;

import com.mouad.Hello_Events.model.TeamMembers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMembersRepo extends JpaRepository<TeamMembers, Long> {
}
