package com.timberware.repository.classification;

import com.timberware.domain.clasiffication.Species;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpeciesRepository extends JpaRepository<Species, Long> {
}
