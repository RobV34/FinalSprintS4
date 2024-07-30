package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.Color;
import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.model.Vibe;
import com.color.finalsprints4.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@CrossOrigin
public class ColorController {

    @Autowired
    private ColorService colorService;


    @GetMapping("colors")
    public List<Color> getColors() {
        return colorService.getAllColors();
    }

    @GetMapping("color/{id}")
    public Optional<Color> getColorById(@PathVariable Long id) {
        return colorService.getColorById(id);
    }

    @PostMapping("newColor")
    public Color getNewColor(@RequestBody Color newColor) {
        return colorService.addColor(newColor);
    }


    @GetMapping("generateUserColor")
    public Optional<Color> generateUserColor(@RequestParam List<Long> userVibeListOfId, @RequestParam Long userSpaceId, @RequestParam Long userStyleId) {
        return colorService.getUserColor(userVibeListOfId, userSpaceId, userStyleId);
    }





}
