package com.color.finalsprints4.repository;

import com.color.finalsprints4.model.Color;
import com.color.finalsprints4.model.Space;
import com.color.finalsprints4.model.Style;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import java.util.Optional;

@Repository
public interface ColorRepository extends CrudRepository<Color, Long> {

    public Optional<Color> findById(Long id);

    public List<Color> findBySpace(Space space);

    public List<Color> findByStyle(Style style);
}
