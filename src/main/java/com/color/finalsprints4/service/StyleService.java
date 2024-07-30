package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Style;
import com.color.finalsprints4.repository.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StyleService {

    @Autowired
    StyleRepository styleRepository;

    public Optional<Style> getStyleById(Long id) {
        return styleRepository.findById(id);
    }
}
