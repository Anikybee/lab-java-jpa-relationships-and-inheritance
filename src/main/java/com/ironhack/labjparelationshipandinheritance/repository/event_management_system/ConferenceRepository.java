package com.ironhack.labjparelationshipandinheritance.repository.event_management_system;

import com.ironhack.labjparelationshipandinheritance.model.event_management_system.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference,Long> {
}
