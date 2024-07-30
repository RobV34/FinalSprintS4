package com.color.finalsprints4.repository;

import com.color.finalsprints4.model.Style;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepository extends CrudRepository<Style, Long> {
}
