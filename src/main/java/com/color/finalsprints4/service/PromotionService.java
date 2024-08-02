package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Promotion;
import com.color.finalsprints4.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionService {

    private final PromotionRepository promotionRepository;

    @Autowired
    public PromotionService(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public List<Promotion> getPromotions(String color, String spaceType) {
        return promotionRepository.findByColorAndSpaceType(color, spaceType);
    }

    public Promotion updatePromotion(Long id, Promotion promotionDetails) {
        Optional<Promotion> optionalPromotion = promotionRepository.findById(id);
        if (optionalPromotion.isPresent()) {
            Promotion promotion = optionalPromotion.get();
            promotion.setColor(promotionDetails.getColor());
            promotion.setSpaceType(promotionDetails.getSpaceType());
            promotion.setUrl(promotionDetails.getUrl());
            return promotionRepository.save(promotion);
        }
        return null; // Or handle appropriately
    }
}
