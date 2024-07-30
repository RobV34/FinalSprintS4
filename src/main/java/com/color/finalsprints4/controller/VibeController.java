package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.Vibe;
import com.color.finalsprints4.service.VibeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class VibeController {

    @Autowired
    private VibeService vibeService;

    @GetMapping("vibes")
    public List<Vibe> getVibes() {
        return vibeService.getAllVibes();
    }

    @PostMapping("newVibe")
    public Vibe newVibe(@RequestBody Vibe newVibe) {
        return vibeService.addVibe(newVibe);
    }

    @DeleteMapping("deleteVibe/{id}")
    public void deleteVibe(@PathVariable Long id) {
        vibeService.deleteVibe(id);
    }
}
