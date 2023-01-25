package com.timberware.repository;

import com.timberware.domain.Assortment;
import org.springframework.data.jpa.repository.JpaRepository;




public interface AssortmentRepository extends JpaRepository<Assortment, Long> {
}
