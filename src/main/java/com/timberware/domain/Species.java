package com.timberware.domain;

import javax.persistence.*;

@Entity
@Table(name = "species")
public class Species {
    @Id
    private Long id;
    private String name;
    private SpeciesType type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpeciesType getType() {
        return type;
    }

    public void setType(SpeciesType type) {
        this.type = type;
    }
}
