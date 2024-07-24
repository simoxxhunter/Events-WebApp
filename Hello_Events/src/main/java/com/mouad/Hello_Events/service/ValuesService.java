package com.mouad.Hello_Events.service;

import com.mouad.Hello_Events.model.Values;

import java.util.List;

public interface ValuesService {

    List<Values> getAllCompanyValues();

    Values getCompanyValueById(Long id);

    Values saveCompanyValue(Values Values);

    void deleteCompanyValue(Long id);
}
