package com.timberware.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long department_id;
    private String name;

    @OneToMany(mappedBy="department")
    private List<AssortmentGroup> assortmentGroups;

    @OneToMany(mappedBy="department")
    private List<Assortment> assortments;

    public Department() {
    }

    public Department(Long id, String name) {
        this.department_id = id;
        this.name = name;
    }

    public Long getId() {
        return department_id;
    }

    public void setId(Long id) {
        this.department_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
