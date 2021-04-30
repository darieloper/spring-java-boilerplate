package com.example.demo.controllers;

import com.example.demo.model.dto.SimpleDTO;
import com.example.demo.model.entity.People;
import com.example.demo.services.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DefaultController {
    private final PeopleService peopleService;

    public DefaultController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    @ResponseBody
    public Iterable<People> getTodos() {
        return peopleService.findAll();
    }
}
