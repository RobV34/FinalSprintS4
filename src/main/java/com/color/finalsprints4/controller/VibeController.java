package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.Vibe;
import com.color.finalsprints4.service.VibeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class VibeController {

    @Autowired
    VibeService vibeService;


    @GetMapping("vibe/{id}")
    public Optional<Vibe> getVibeById(@PathVariable Long id) {
        return vibeService.getVibeById(id);
    }

    @PostMapping("newVibe")
    public Vibe newVibe(@RequestBody Vibe newVibe) {
        return vibeService.addVibe(newVibe);
    }

    @PutMapping("updateVibe/{id}")
    public ResponseEntity<Vibe> updateVibe(@PathVariable("id") Long id, @RequestBody Vibe vibe) {
        Vibe updatedVibe = vibeService.updateVibe(id, vibe);
        if (updatedVibe == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedVibe);
    }

    @DeleteMapping("deleteVibe/{id}")
    public void deleteVibe(@PathVariable Long id) {
        vibeService.deleteVibe(id);
    }
}
