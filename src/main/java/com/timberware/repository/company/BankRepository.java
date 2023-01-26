package com.timberware.repository.company;

import com.timberware.domain.company.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
