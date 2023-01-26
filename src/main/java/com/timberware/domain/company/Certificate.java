package com.timberware.domain.company;

import javax.persistence.*;

@Entity
@Table(name = "certificates")
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private boolean active;
    private String notes;

    @OneToOne()
    @JoinColumn(name = "certificate_id")
    private Company company;

    public Certificate() {
    }

    public Certificate(Long id, String name, String code, boolean active, String notes) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.active = active;
        this.notes = notes;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
