package com.ironhack.labjparelationshipandinheritance.service.event_management_system;

import com.ironhack.labjparelationshipandinheritance.model.event_management_system.Conference;
import com.ironhack.labjparelationshipandinheritance.repository.event_management_system.ConferenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceService {
    private ConferenceRepository conferenceRepository;

    public ConferenceService(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }

    public Conference findAll(){
        return findAll();
    }

    public Conference save(Conference conference){
        return conferenceRepository.save(conference);
    }

}
