package com.color.finalsprints4.repository;

import com.color.finalsprints4.model.Color;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ColorRepository extends CrudRepository<Color, Long> {

    public Optional<Color> findById(Long id);
}
