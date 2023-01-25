package com.timberware.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="assortment_groups")
public class AssortmentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assortment_groups_id;
    private String name;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;
    @OneToMany (mappedBy = "assortmentGroup")
    private List<Assortment> assortments;

    public AssortmentGroup() {
    }

    public AssortmentGroup(Long id, String name, Department department) {
        this.assortment_groups_id = id;
        this.name = name;
        this.department = department;
    }

    public Long getId() {
        return assortment_groups_id;
    }

    public void setId(Long id) {
        this.assortment_groups_id = id;
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
}
