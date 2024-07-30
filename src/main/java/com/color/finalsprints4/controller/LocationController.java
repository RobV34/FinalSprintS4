package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.Location;
import java.util.List;

@RestController
@CrossOrigin

public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("locations")
    public List<Location> getLocations() {
        return locationService.getAllLocations();
    }

    @PostMapping("newLocation")
    public Location newLocation(@RequestBody Location newLocation) {
        return locationService.addLocation(newLocation);
    }

    @DeleteMapping("deleteLocation/{id}")
    public void deleteLocation(@PathVariable Long id) {
        locationService.deleteLocation(id);
    }
}
