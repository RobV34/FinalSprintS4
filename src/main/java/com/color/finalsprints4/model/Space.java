package com.color.finalsprints4.model;

import jakarta.persistence.*;


@Entity
public class Space {

    @Id
    @SequenceGenerator(name = "space_sequence", sequenceName = "space_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "space_sequence")
    private Long id;

    private String spaceName;

    @OneToOne
    private Promotion promotion;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }



}