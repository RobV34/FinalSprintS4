package com.color.finalsprints4.repository;

import com.color.finalsprints4.model.Vibe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VibeRepository extends CrudRepository<Vibe, Long> {

    public Optional<Vibe> findById(Long id);
}
