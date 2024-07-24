package com.mouad.Hello_Events.controller;

import com.mouad.Hello_Events.model.TeamMembers;
import com.mouad.Hello_Events.model.Values;
import com.mouad.Hello_Events.repository.ValuesRepo;
import com.mouad.Hello_Events.service.TeamMembersService;
import com.mouad.Hello_Events.service.ValuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/about")
public class AboutController {

    @Autowired
    private  TeamMembersService teamMembersService;

    @Autowired
    private  ValuesService valuesService;

    @Autowired
    private ValuesService companyValueService;

    @GetMapping("/team-members")
    public List<TeamMembers> getAllTeamMembers() {
        return teamMembersService.getAllTeamMembers();
    }

    @GetMapping("/values")
    public List<Values> getAllCompanyValues() {
        return valuesService.getAllCompanyValues();
    }
}
