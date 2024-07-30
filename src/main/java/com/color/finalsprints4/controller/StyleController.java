package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.Style;
import com.color.finalsprints4.service.StyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StyleController {

    @Autowired
    private StyleService styleService;

    @GetMapping("styles")
    public List<Style> getStyles() {
        return styleService.getAllStyles();
    }

    @PostMapping("newStyle")
    public Style newStyle(@RequestBody Style newStyle) {
        return styleService.addStyle(newStyle);
    }

    @DeleteMapping("deleteStyle/{id}")
    public void deleteStyle(@PathVariable Long id) {
        styleService.deleteStyle(id);
    }
}