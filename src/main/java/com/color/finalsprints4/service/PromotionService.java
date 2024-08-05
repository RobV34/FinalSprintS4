package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Color;
import com.color.finalsprints4.model.Promotion;
import com.color.finalsprints4.model.Space;
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

    public Promotion updatePromotion(Long id, Promotion promotionDetails) {
        Optional<Promotion> optionalPromotion = promotionRepository.findById(id);
        if (optionalPromotion.isPresent()) {
            Promotion promotion = optionalPromotion.get();
            promotion.setCompanyName(promotionDetails.getCompanyName());
            promotion.setUrl(promotionDetails.getUrl());
            return promotionRepository.save(promotion);
        }
        return null;
    }

    public Promotion getPromotionById(Long id) {
        Optional<Promotion> result = promotionRepository.findById(id);

        if (result.isPresent()) {
            return result.get();
        }

        return null;
    }
}