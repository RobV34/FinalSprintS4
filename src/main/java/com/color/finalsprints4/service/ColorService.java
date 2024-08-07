package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Vibe;
import com.color.finalsprints4.repository.ColorRepository;
import com.color.finalsprints4.repository.SpaceRepository;
import com.color.finalsprints4.repository.StyleRepository;
import com.color.finalsprints4.repository.VibeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.color.finalsprints4.model.Color;
import java.util.stream.Collectors;

import java.util.*;

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

<<<<<<< Updated upstream
     public Color getColorById(Long id){
         Optional<Color> result = colorRepository.findById(id);

         if (result.isPresent()) {
             return result.get();
         }

         return null;
=======
    public List<Color> addColors(List<Color> newColors) {
        return (List<Color>) colorRepository.saveAll(newColors);
    }

     public Optional<Color> getColorById(Long id){
        return colorRepository.findById(id);
>>>>>>> Stashed changes
     }

    public Optional<Color> getUserColor(List<Long> userVibesListOfId, Long userSpaceId, Long userStyleId) {

        List<Color> spaceAndStyleResults = colorRepository.findBySpaceIdAndStyleId(userSpaceId, userStyleId);

        Set<Vibe> userVibes = userVibesListOfId.stream()
                .map(vibeRepository::findById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toSet());

        return spaceAndStyleResults.stream()
                .max(Comparator.comparingInt(color -> countCommonVibes(color, userVibes)));

    }

    private int countCommonVibes(Color color, Set<Vibe> userVibes) {
        Set<Vibe> colorVibes = new HashSet<>(color.getVibeList());
        colorVibes.retainAll(userVibes);
        return colorVibes.size();
    }

<<<<<<< Updated upstream
    public void deleteColor(Long id) {
        colorRepository.deleteById(id);
    }

    public Color updateColor(Long id, Color updatedColor) {
        Color colorToUpdate = getColorById(id);

        colorToUpdate.setId(updatedColor.getId());
        colorToUpdate.setName(updatedColor.getName());
        colorToUpdate.setHexNumber(updatedColor.getHexNumber());
        colorToUpdate.setSpace(updatedColor.getSpace());
        colorToUpdate.setStyle(updatedColor.getStyle());
        colorToUpdate.setVibeList(updatedColor.getVibeList());

        return colorRepository.save(colorToUpdate); 
    }
  
=======

>>>>>>> Stashed changes
}
