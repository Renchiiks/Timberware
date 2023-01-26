package com.timberware.domain.company;

import org.hibernate.validator.constraints.CreditCardNumber;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bank_accounts")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreditCardNumber
    @NotNull
    private String accountNumber;
    @NotNull
    private boolean defaultAcc;
    @NotNull
    private boolean active;
    @ManyToOne
    @JoinColumn(name = "bank_id")
    @NotNull
    private Bank bank;

    @ManyToOne
    @JoinColumn(name = "company_id")
    @NotNull
    private Company company;

    public BankAccount() {
    }

    public BankAccount(Long id, String accountNumber, boolean defaultAcc, boolean active, Bank bank, Company company) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.defaultAcc = defaultAcc;
        this.active = active;
        this.bank = bank;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isDefaultAcc() {
        return defaultAcc;
    }

    public void setDefaultAcc(boolean defaultAcc) {
        this.defaultAcc = defaultAcc;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
