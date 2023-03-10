package com.timberware.domain.clasiffication;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "classification_departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "department")
    private List<AssortmentGroup> assortmentGroups;

    @OneToMany(mappedBy = "department")
    private List<Assortment> assortments;

    public Department() {
    }

    public Department(Long id, String name) {
        this.id = id;
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
}
