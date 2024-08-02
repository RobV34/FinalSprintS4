package com.color.finalsprints4.controller;

import com.color.finalsprints4.model.Promotion;
import com.color.finalsprints4.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/promotions")
public class PromotionController {

    @Autowired
    private PromotionService promotionService;

    @GetMapping
    public List<Promotion> getAllPromotions() {
        return promotionService.getAllPromotions();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Promotion> getPromotionById(@PathVariable Long id) {
        return promotionService.getPromotionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Promotion createPromotion(@RequestBody Promotion promotion) {
        return promotionService.addPromotion(promotion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Promotion> updatePromotion(@PathVariable Long id, @RequestBody Promotion promotionDetails) {
        Promotion updatedPromotion = promotionService.updatePromotion(id, promotionDetails);
        if (updatedPromotion != null) {
            return ResponseEntity.ok(updatedPromotion);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePromotion(@PathVariable Long id) {
        promotionService.deletePromotion(id);
        return ResponseEntity.noContent().build();
    }
}


