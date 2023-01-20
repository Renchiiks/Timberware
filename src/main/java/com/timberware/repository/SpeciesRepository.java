package com.timberware.repository;

import com.timberware.domain.Species;
import org.springframework.data.repository.CrudRepository;


public interface SpeciesRepository extends CrudRepository<Species, Long> {
}
