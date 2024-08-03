package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class SpaceController {

    @Autowired
    SpaceService spaceService;

    @GetMapping("space/{id}")
    public Space getSpaceById(@PathVariable Long id) {
        return spaceService.getSpaceById(id);
    }

    @PostMapping("newSpace")
    public Space newSpace(@RequestBody Space newSpace) {
        return spaceService.addSpace(newSpace);
    }

    @DeleteMapping("deleteSpace/{id}")
    public void deleteLocation(@PathVariable Long id) {
        spaceService.deleteLocation(id);
    }

    @PutMapping("updateSpace/{id}")
    public Space updateSpace(@PathVariable Long id, @RequestBody Space updatedSpace) {
        return spaceService.updateSpace(id, updatedSpace);
    }
}
