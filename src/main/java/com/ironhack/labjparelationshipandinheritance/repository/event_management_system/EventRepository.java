package com.ironhack.labjparelationshipandinheritance.repository.event_management_system;

import com.ironhack.labjparelationshipandinheritance.model.event_management_system.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
}
