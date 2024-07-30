package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StyleService {

    public List<Style> getAllStyles() {
        return List.of();
    }

    public Style addStyle(Style newStyle) {
        return newStyle;
    }

    public void deleteStyle(Long id) {

    }
}
