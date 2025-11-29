package com.ironhack.labjparelationshipandinheritance.repository.nurse_association;

import com.ironhack.labjparelationshipandinheritance.model.nurse_association.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Long> {
}
