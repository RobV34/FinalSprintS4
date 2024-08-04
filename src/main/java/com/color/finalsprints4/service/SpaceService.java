package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Color;
import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpaceService {

    @Autowired
    SpaceRepository spaceRepository;

    public Space getSpaceById(Long id){
        Optional<Space> result = spaceRepository.findById(id);

        if (result.isPresent()) {
            return result.get();
        }

        return null;
    }


    public Space addSpace(Space newSpace) {
        return spaceRepository.save(newSpace);
    }

    public void deleteLocation(Long id) {
        spaceRepository.deleteById(id);
    }

    public Space updateSpace(Long id, Space updatedSpace) {

        Space spaceToUpdate = getSpaceById(id);

        spaceToUpdate.setId(updatedSpace.getId());
        spaceToUpdate.setSpaceName(updatedSpace.getSpaceName());
        spaceToUpdate.setSuggestedAddOns(updatedSpace.getSuggestedAddOns());

        return spaceRepository.save(spaceToUpdate);

    }
}
