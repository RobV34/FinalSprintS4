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


    @GetMapping("colors")
    public List<Color> getColors() {
        return colorService.getAllColors();
    }

    @GetMapping("color/{id}")
    public Optional<Color> getColorById(@PathVariable Long id) {
        return colorService.getColorById(id);
    }

    @PostMapping("newColor")
    public Color newColor(@RequestBody Color newColor) {
        return colorService.addColor(newColor);
    }





}
