package com.example.demo.services.impl;

import com.example.demo.dao.PeopleRepository;
import com.example.demo.model.entity.People;
import com.example.demo.services.PeopleService;
import org.springframework.stereotype.Service;

@Service("PeopleService")
public class PeopleServiceImpl implements PeopleService {
    private final PeopleRepository peopleRepository;

    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public Iterable<People> findAll() {
        return peopleRepository.findAll();
    }
}
