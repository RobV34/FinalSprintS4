package com.color.finalsprints4.repository;

import com.color.finalsprints4.model.Space;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpaceRepository extends CrudRepository<Space, Long> {

    public Optional<Space> findById(Long id);
}
