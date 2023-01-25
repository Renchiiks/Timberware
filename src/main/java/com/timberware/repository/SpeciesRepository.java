package com.timberware.repository;

import com.timberware.domain.Species;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpeciesRepository extends JpaRepository<Species, Long> {
}
