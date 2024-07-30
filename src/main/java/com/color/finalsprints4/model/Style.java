package com.color.finalsprints4.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Style {

    @Id
    @SequenceGenerator(name = "style_sequence", sequenceName = "style_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "style_sequence")
    private Long id;

    private String styleName;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }


}
