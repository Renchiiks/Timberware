package com.timberware.domain;


import javax.persistence.*;

@Entity
@Table(name="assortments")
public class Assortment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assortments_id;
    private String name;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;
    @ManyToOne
    @JoinColumn(name="assortment_groups_id")
    private AssortmentGroup assortmentGroup;
    @ManyToOne
    @JoinColumn(name="species_id")
    private Species species;

    public Assortment() {
    }

    public Assortment(Long id, String name, Department department, AssortmentGroup assortmentGroup, Species species) {
        this.assortments_id = id;
        this.name = name;
        this.department = department;
        this.assortmentGroup = assortmentGroup;
        this.species = species;
    }

    public Long getId() {
        return assortments_id;
    }

    public void setId(Long id) {
        this.assortments_id = id;
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
