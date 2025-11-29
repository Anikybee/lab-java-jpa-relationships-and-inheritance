package com.ironhack.labjparelationshipandinheritance.repository.event_management_system;

import com.ironhack.labjparelationshipandinheritance.model.event_management_system.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker,Long> {
}
