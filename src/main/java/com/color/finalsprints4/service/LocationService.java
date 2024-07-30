package com.color.finalsprints4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.Location;
import java.util.List;

@Service
public class LocationService {


    public List<Location> getAllLocations() {
        return List.of();
    }

    public Location addLocation(Location newLocation) {
        return newLocation;
    }

    public void deleteLocation(Long id) {

    }
}
