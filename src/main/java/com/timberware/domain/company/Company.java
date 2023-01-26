package com.timberware.domain.company;

import javax.persistence.*;

@Entity
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long registrationNumber;
    private boolean VATTaxPayer;
    @OneToOne(mappedBy = "company")
    private Address address;
    @ManyToOne
    @JoinColumn(name = "contact_person_id")
    private ContactPerson contactPerson;
    @OneToOne(mappedBy = "company")
    private Certificate certificate;
    @ManyToOne
    @JoinColumn(name = "bank_account_id")
    private BankAccount bankAccount;

    public Company() {
    }

    public Company(Long id, String name, Long registrationNumber, boolean VATTaxPayer, Address address, ContactPerson contactPerson, Certificate certificate) {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.VATTaxPayer = VATTaxPayer;
        this.address = address;
        this.contactPerson = contactPerson;
        this.certificate = certificate;
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

    public Long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isVATTaxPayer() {
        return VATTaxPayer;
    }

    public void setVATTaxPayer(boolean VATTaxPayer) {
        this.VATTaxPayer = VATTaxPayer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
}
