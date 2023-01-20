package com.timberware.repository;

import com.timberware.domain.Assortment;
import org.springframework.data.repository.CrudRepository;



public interface AssortmentRepository extends CrudRepository<Assortment, Long> {
}
