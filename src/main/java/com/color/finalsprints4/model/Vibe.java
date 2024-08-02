package com.color.finalsprints4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Vibe {

    @Id
    @SequenceGenerator(name = "vibe_sequence", sequenceName = "vibe_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "vibe_sequence")

    private Long id;

    private String vibeName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVibeName() {
        return vibeName;
    }

    public void setVibeName(String vibeName) {
        this.vibeName = vibeName;
    }

}
