package com.timberware.domain.clasiffication;


import javax.persistence.*;

@Entity
@Table(name = "assortments")
public class Assortment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    @ManyToOne
    @JoinColumn(name = "assortment_groups_id")
    private AssortmentGroup assortmentGroup;
    @ManyToOne
    @JoinColumn(name = "species_id")
    private Species species;

    public Assortment() {
    }

    public Assortment(String name) {
        this.name = name;
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
