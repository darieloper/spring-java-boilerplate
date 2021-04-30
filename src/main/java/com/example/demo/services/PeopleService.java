package com.example.demo.services;

import com.example.demo.model.entity.People;

public interface PeopleService {
    Iterable<People> findAll();
}
