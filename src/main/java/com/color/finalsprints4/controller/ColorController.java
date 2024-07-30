package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.Color;
import com.color.finalsprints4.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ColorController {

    @Autowired
    private ColorService colorService;

    @GetMapping("colors")
    public List<Color> getColors() {
        return colorService.getAllColors();
    }

    @PostMapping("newColor")
    public Color newColor(@RequestBody Color newColor) {
        return colorService.addColor(newColor);
    }





}
