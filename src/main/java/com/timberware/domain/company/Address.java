package com.timberware.domain.company;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String address;
    @NotNull
    private boolean actualAddress;
    @NotNull
    private boolean legalAddress;
    @NotNull
    private boolean deliveryAddress;
    @NotNull
    private boolean active;
    @ManyToOne
    @JoinColumn(name = "company_id")
    @NotNull
    private Company company;

    public Address() {
    }

    public Address(Long id, String address, boolean actualAddress, boolean legalAddress, boolean deliveryAddress, boolean active, Company company) {
        this.id = id;
        this.address = address;
        this.actualAddress = actualAddress;
        this.legalAddress = legalAddress;
        this.deliveryAddress = deliveryAddress;
        this.active = active;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActualAddress() {
        return actualAddress;
    }

    public void setActualAddress(boolean actualAddress) {
        this.actualAddress = actualAddress;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public boolean isLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(boolean legalAddress) {
        this.legalAddress = legalAddress;
    }

    public boolean isDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(boolean deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
