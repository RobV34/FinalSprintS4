package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.model.Style;
import com.color.finalsprints4.model.Vibe;
import com.color.finalsprints4.repository.ColorRepository;
import com.color.finalsprints4.repository.SpaceRepository;
import com.color.finalsprints4.repository.StyleRepository;
import com.color.finalsprints4.repository.VibeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.color.finalsprints4.model.Color;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ColorService {

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private SpaceRepository spaceRepository;

    @Autowired
    private StyleRepository styleRepository;

    @Autowired
    private VibeRepository vibeRepository;

    public List<Color> getAllColors() {
        return (List<Color>) colorRepository.findAll();
    }

    public Color addColor(Color color) {
        return colorRepository.save(color);
    }

    public Optional<Color> getColorById(Long id) {
        return colorRepository.findById(id);
    }

    public Optional<Color> getUserColor(List<Long> userVibesListOfId, Long userSpaceId, Long userStyleId) {

        Optional<Space> spaceObjectSearch = spaceRepository.findById(userSpaceId);
        Optional<Style> styleObjectSearch = styleRepository.findById(userStyleId);

        Space space = spaceObjectSearch.orElse(null);
        Style style = styleObjectSearch.orElse(null);

        List<Color> possibleSpaceMatches = colorRepository.findBySpace(space);
        List<Color> possibleStyleMatches = colorRepository.findByStyle(style);

        Set<Color> spaceAndStyleMatches = new HashSet<>(possibleSpaceMatches);
        spaceAndStyleMatches.retainAll(possibleStyleMatches);

        List<Color> listSpaceAndStyleMatches = new ArrayList<>(spaceAndStyleMatches);

        Set<Vibe> userVibes = userVibesListOfId.stream()
                .map(vibeRepository::findById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toSet());

        return listSpaceAndStyleMatches.stream()
                .max(Comparator.comparingInt(color -> countCommonVibes(color, userVibes)));
    }

    private int countCommonVibes(Color color, Set<Vibe> userVibes) {
        Set<Vibe> colorVibes = new HashSet<>(color.getVibeList());
        colorVibes.retainAll(userVibes);
        return colorVibes.size();
    }

    public void deleteColor(Long id) {
        colorRepository.deleteById(id);
    }

    public Color updateColor(Long id, Color updatedColor) {
        Optional<Color> existingColor = colorRepository.findById(id);
        if (existingColor.isPresent()) {
            Color color = existingColor.get();
            color.setName(updatedColor.getName());
            color.setHexNumber(updatedColor.getHexNumber());
            color.setVibeList(updatedColor.getVibeList());
            color.setSpace(updatedColor.getSpace());
            color.setStyle(updatedColor.getStyle());
            return colorRepository.save(color);
        } else {
            return null;
        }
    }
}
