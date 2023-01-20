package com.timberware.domain;


import javax.persistence.*;

@Entity
@Table(name="assortments")
public class Assortment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Department department;
    private AssortmentGroup assortmentGroup;
    private Species species;

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public AssortmentGroup getAssortmentGroup() {
        return assortmentGroup;
    }

    public void setAssortmentGroup(AssortmentGroup assortmentGroup) {
        this.assortmentGroup = assortmentGroup;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }
}
