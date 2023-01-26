package com.timberware.domain.company;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private Long registrationNumber;
    @NotNull
    private boolean VATTaxPayer;
    private String homepage;
    @OneToMany(mappedBy = "company")
    @NotEmpty
    private Set<Address> addresses;

    @OneToMany(mappedBy = "company")
    @NotEmpty
    private Set<ContactPerson> contactPerson;

    @OneToMany(mappedBy = "company")
    private Set<Certificate> certificate;

    @OneToMany(mappedBy = "company")
    private Set<BankAccount> bankAccount;

    public Company() {
    }

    public Company(Long id, String name, Long registrationNumber, boolean VATTaxPayer, String homepage, Set<Address> addresses, Set<ContactPerson> contactPerson, Set<Certificate> certificate, BankAccount bankAccount) {
        this.id = id;
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.VATTaxPayer = VATTaxPayer;
        this.homepage = homepage;
        this.addresses = addresses;
        this.contactPerson = contactPerson;
        this.certificate = certificate;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Set<BankAccount> getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Set<BankAccount> bankAccount) {
        this.bankAccount = bankAccount;
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

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<ContactPerson> getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Set<ContactPerson> contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Set<Certificate> getCertificate() {
        return certificate;
    }

    public void setCertificate(Set<Certificate> certificate) {
        this.certificate = certificate;
    }
}
