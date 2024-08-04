package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.model.Style;
import com.color.finalsprints4.repository.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StyleService {

    @Autowired
    StyleRepository styleRepository;

    public Style getStyleById(Long id) {
        Optional<Style> result = styleRepository.findById(id);

        if (result.isPresent()) {
            return result.get();
        }

        return null;
    }

    public Style addStyle(Style newStyle) {
        return styleRepository.save(newStyle);
    }

    public void deleteStyle(Long id) {
        styleRepository.deleteById(id);
    }

    public Style updateStyle(Long id, Style updatedStyle) {

        Style styleToUpdate = getStyleById(id);

        styleToUpdate.setId(updatedStyle.getId());
        styleToUpdate.setStyleName(updatedStyle.getStyleName());

        return styleRepository.save(styleToUpdate);

    }
}
