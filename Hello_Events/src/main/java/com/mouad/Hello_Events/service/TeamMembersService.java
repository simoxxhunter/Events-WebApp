package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.TeamMembers;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TeamMembersService {

    List<TeamMembers> getAllTeamMembers();

    TeamMembers getTeamMembersById(Long id);

    TeamMembers saveTeamMembers(TeamMembers teamMembers);

    void deleteTeamMembers(Long id);
}
