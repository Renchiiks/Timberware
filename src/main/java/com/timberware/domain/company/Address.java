package com.timberware.domain.company;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String actualAddress;
    private String legalAddress;
    private String deliveryAddress;
    private boolean active;
    @OneToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Address() {
    }

    public Address(String actualAddress, String legalAddress, String deliveryAddress, boolean active) {
        this.actualAddress = actualAddress;
        this.legalAddress = legalAddress;
        this.deliveryAddress = deliveryAddress;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActualAddress() {
        return actualAddress;
    }

    public void setActualAddress(String actualAddress) {
        this.actualAddress = actualAddress;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
