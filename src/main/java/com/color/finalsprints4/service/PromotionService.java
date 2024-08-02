package com.color.finalsprints4.service;

import com.color.finalsprints4.model.Promotion;
import com.color.finalsprints4.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    public List<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    public Optional<Promotion> getPromotionById(Long id) {
        return promotionRepository.findById(id);
    }

    public Promotion addPromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    public Promotion updatePromotion(Long id, Promotion promotionDetails) {
        Optional<Promotion> optionalPromotion = promotionRepository.findById(id);

        if (optionalPromotion.isPresent()) {
            Promotion promotion = optionalPromotion.get();
            promotion.setColor(promotionDetails.getColor());
            promotion.setSpace(promotionDetails.getSpace());
            promotion.setUrl(promotionDetails.getUrl());
            return promotionRepository.save(promotion);
        }

        return null; // Or throw an exception
    }

    public void deletePromotion(Long id) {
        promotionRepository.deleteById(id);
    }
}


