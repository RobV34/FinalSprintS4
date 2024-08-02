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

    public Style addStyle(Style newStyle) {
        return styleRepository.save(newStyle);
    }

    public void deleteStyle(Long id) {
        styleRepository.deleteById(id);
    }

    public Style updateStyle(Long id, Style updatedStyle) {

        Style existingStyle = styleRepository.findById(id)
                .orElse(null);

        if (existingStyle != null) {

            if (updatedStyle.getStyleName() != null) {
                existingStyle.setStyleName(updatedStyle.getStyleName());
            }

            return styleRepository.save(existingStyle);
        } else {

            return null;
        }
    }
}
