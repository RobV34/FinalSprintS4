package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpaceService {

    @Autowired
    SpaceRepository spaceRepository;

    public Optional<Space> getSpaceById(Long id){
        return spaceRepository.findById(id);
    }


}
