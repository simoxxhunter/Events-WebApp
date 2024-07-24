package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.Values;
import com.mouad.Hello_Events.repository.ValuesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValuesServiceImp implements ValuesService {

    @Autowired
    private ValuesRepo ValuesRepo;
    @Autowired
    private ValuesRepo valuesRepo;

    @Override
    public List<Values> getAllCompanyValues() {
        return ValuesRepo.findAll();
    }

    @Override
    public Values getCompanyValueById(Long id) {
        return ValuesRepo.findById(id).orElse(null);
    }

    @Override
    public Values saveCompanyValue(Values Values) {
        return valuesRepo.save(Values);
    }

    @Override
    public void deleteCompanyValue(Long id) {
        valuesRepo.deleteById(id);
    }
}
