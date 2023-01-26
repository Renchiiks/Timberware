package com.timberware.domain.company;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "banks")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(min = 8, max = 11)
    @Column(unique = true, length = 11)
    @NotNull
    private String BIC;
    @Column(unique = true)
    @NotNull
    private String name;
    @OneToMany(mappedBy = "bank")
    private Set<BankAccount> bankAccounts;

    public Bank() {
    }

    public Bank(Long id, String BIC, String name) {
        this.id = id;
        this.BIC = BIC;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBIC() {
        return BIC;
    }

    public void setBIC(String BIC) {
        this.BIC = BIC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
