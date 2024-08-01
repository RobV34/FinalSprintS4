package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.Color;
import com.color.finalsprints4.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
public class ColorController {

    @Autowired
    private ColorService colorService;
    private Object updatedColor;


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

    @PutMapping("updateColor/{id}")
    public Color updateColor(@PathVariable Long id, @RequestBody Color updateColor) {
       return colorService.updateColor(id, updatedColor); 
    }

    @DeleteMapping("deleteColor/{id}")
    public void deleteColor(@PathVariable Long id) {
        colorService.deleteColor(id);
    }


    @GetMapping("generateUserColor")
    public Optional<Color> generateUserColor(@RequestParam List<Long> userVibeListOfId, @RequestParam Long userSpaceId, @RequestParam Long userStyleId) {
        return colorService.getUserColor(userVibeListOfId, userSpaceId, userStyleId);
    }





}
