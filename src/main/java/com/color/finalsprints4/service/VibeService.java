package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Vibe;
import com.color.finalsprints4.repository.VibeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VibeService {

    @Autowired
    VibeRepository vibeRepository;

    public Optional<Vibe> getVibeById(Long id) {
        return vibeRepository.findById(id);
    }
}
