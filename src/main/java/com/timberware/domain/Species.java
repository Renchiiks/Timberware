package com.timberware.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "species")
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique=true)
    private String abbreviation;
    private SpeciesType type;
    @OneToMany (mappedBy = "species")
    private List<Assortment> assortments;

    public Species() {
    }

    public Species(Long id, String name, String abbreviation, SpeciesType type) {
        this.id = id;
        this.name = name;
        this.abbreviation = abbreviation;
        this.type = type;
    }

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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
