package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Vibe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VibeService {
    public List<Vibe> getAllVibes() {
        return List.of();
    }

    public Vibe addVibe(Vibe newVibe) {
        return newVibe;
    }

    public void deleteVibe(Long id) {
    }
}
