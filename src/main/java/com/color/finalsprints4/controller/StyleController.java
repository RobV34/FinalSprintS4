package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.Style;
import com.color.finalsprints4.service.StyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class StyleController {

    @Autowired
    StyleService styleService;

    @GetMapping("style/{id}")
    public Optional<Style> getStyleById(@PathVariable Long id) {
        return styleService.getStyleById(id);
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
