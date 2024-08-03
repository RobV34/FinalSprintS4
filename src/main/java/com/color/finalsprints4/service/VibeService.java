package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Color;
import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.model.Vibe;
import com.color.finalsprints4.repository.VibeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VibeService {

    @Autowired
    VibeRepository vibeRepository;

    public Vibe getVibeById(Long id) {
        Optional<Vibe> result = vibeRepository.findById(id);

        if (result.isPresent()) {
            return result.get();
        }

        return null;
    }

    public Vibe addVibe(Vibe newVibe) {
        return vibeRepository.save(newVibe);
    }

    public void deleteVibe(Long id) {
        vibeRepository.deleteById(id);
    }

    public Vibe updateVibe(Long id, Vibe updatedVibe) {
        Vibe vibeToUpdate = getVibeById(id);

        vibeToUpdate.setId(updatedVibe.getId());
        vibeToUpdate.setVibeName(updatedVibe.getVibeName());

        return vibeRepository.save(vibeToUpdate);
    }
}
