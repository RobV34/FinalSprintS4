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

    public Vibe addVibe(Vibe newVibe) {
        return vibeRepository.save(newVibe);
    }

    public void deleteVibe(Long id) {
        vibeRepository.deleteById(id);
    }

    public Vibe updateVibe(Long id, Vibe vibe) {
        return vibeRepository.findById(id).map(existingVibe -> {
            existingVibe.setVibeName(vibe.getVibeName());
            return vibeRepository.save(existingVibe);
        }).orElse(null);
    }
}
