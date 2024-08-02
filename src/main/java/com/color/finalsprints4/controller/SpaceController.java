package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("newSpace")
    public Space newSpace(@RequestBody Space newSpace) {
        return spaceService.addSpace(newSpace);
    }

    @PutMapping("updateSpace/{id}")
    public ResponseEntity<Space> updateSpace(@PathVariable Long id, @RequestBody Space updatedSpace) {
        Space result = spaceService.updateSpace(id, updatedSpace);
        if (result != null) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }


    @DeleteMapping("deleteSpace/{id}")
    public void deleteLocation(@PathVariable Long id) {
        spaceService.deleteLocation(id);
    }
}
