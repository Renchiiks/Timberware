package com.timberware.repository.company;

import com.timberware.domain.company.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
