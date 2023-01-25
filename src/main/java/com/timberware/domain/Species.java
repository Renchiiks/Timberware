package com.timberware.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "species")
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long species_id;
    private String name;
    private String abbreviation;
    private SpeciesType type;
    @OneToMany (mappedBy = "species")
    private List<Assortment> assortments;

    public Species() {
    }

    public Species(Long id, String name, SpeciesType type) {
        this.species_id = id;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return species_id;
    }

    public void setId(Long id) {
        this.species_id = id;
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
