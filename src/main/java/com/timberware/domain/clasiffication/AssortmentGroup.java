package com.timberware.domain.clasiffication;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="classification_assortment_groups")
public class AssortmentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String name;
    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;
    @OneToMany (mappedBy = "assortmentGroup")
    private List<Assortment> assortments;

    public AssortmentGroup() {
    }

    public AssortmentGroup(Long id, String name) {
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
