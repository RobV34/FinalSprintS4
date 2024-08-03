package com.color.finalsprints4.repository;

import com.color.finalsprints4.model.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {
    List<Promotion> findByColorAndSpaceType(String color, String spaceType);
}
