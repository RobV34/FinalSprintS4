package com.color.finalsprints4.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class Color {

    @Id
    @SequenceGenerator(name = "color_sequence", sequenceName = "color_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "color_sequence")
    private Long id;

    private String name;
    private String hexNumber;


    @ManyToMany(fetch = FetchType.EAGER)
    private List<Vibe> vibeList;

    @ManyToOne(fetch = FetchType.EAGER)
    private Space space;

    @ManyToOne(fetch = FetchType.EAGER)
    private Style style;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHexNumber() {
        return hexNumber;
    }

    public void setHexNumber(String hexNumber) {
        this.hexNumber = hexNumber;
    }

    public List<Vibe> getVibeList() {
        return vibeList;
    }

    public void setVibeList(List<Vibe> vibeList) {
        this.vibeList = vibeList;
    }

    public Space getSpace() {
        return space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return Objects.equals(id, color.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
