package com.timberware.domain.company;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "company_contact_persons")
public class ContactPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String position;
    @Email
    private String email;
    private int number;
    private boolean active;
    private boolean signatureApproved;
    @ManyToOne
    @JoinColumn(name = "contact_person_id")
    Company company;

    public ContactPerson() {
    }

    public ContactPerson(Long id, String fullName, String position, String email, int number, boolean active, boolean signatureApproved, Company companiesSet) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.active = active;
        this.signatureApproved = signatureApproved;
        this.company = companiesSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
