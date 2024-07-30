package com.color.finalsprints4.service;

import com.color.finalsprints4.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.color.finalsprints4.model.Color;

import java.util.List;
import java.util.Optional;

@Service
public class ColorService {

    @Autowired
    private ColorRepository colorRepository;

    public List<Color> getAllColors() {
            return (List<Color>) colorRepository.findAll();
    }

     public Color addColor(Color color) {
        return colorRepository.save(color);
     }

     public Optional<Color> getColorById(Long id){
        return colorRepository.findById(id);
     }

}
