package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.TeamMembers;
import com.mouad.Hello_Events.repository.TeamMembersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamMembersServiceImp {

    @Autowired
    private TeamMembersRepo TeamMembersRepository;

    public List<TeamMembers> getAllTeamMembers() {
        return TeamMembersRepository.findAll();
    }

    public TeamMembers getTeamMembersById(Long id) {
        return TeamMembersRepository.findById(id).orElse(null);
    }

    public TeamMembers saveTeamMembers(TeamMembers TeamMembers) {
        return TeamMembersRepository.save(TeamMembers);
    }

    public void deleteTeamMembers(Long id) {
        TeamMembersRepository.deleteById(id);
    }
}
