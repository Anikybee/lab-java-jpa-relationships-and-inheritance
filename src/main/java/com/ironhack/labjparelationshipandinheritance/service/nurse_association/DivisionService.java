package com.ironhack.labjparelationshipandinheritance.service.nurse_association;

import com.ironhack.labjparelationshipandinheritance.model.nurse_association.Division;
import com.ironhack.labjparelationshipandinheritance.repository.nurse_association.DivisionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService {

    private final DivisionRepository divisionRepository;

    public DivisionService(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }

    public List<Division> findAll(){
        return divisionRepository.findAll();
    }

    public Division save(Division division){
        return divisionRepository.save(division);
    }
}
