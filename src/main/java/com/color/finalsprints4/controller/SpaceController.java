package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin
public class SpaceController {

    @Autowired
    SpaceService spaceService;

    @GetMapping("space/{id}")
    public Optional<Space> getSpaceById(@PathVariable Long id) {
        return spaceService.getSpaceById(id);
    }
}
