package com.ironhack.labjparelationshipandinheritance.service.nurse_association;

import com.ironhack.labjparelationshipandinheritance.model.nurse_association.Association;
import com.ironhack.labjparelationshipandinheritance.repository.nurse_association.AssociationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssociationService {

    private final AssociationRepository associationRepository;

    public AssociationService(AssociationRepository associationRepository) {
        this.associationRepository = associationRepository;
    }

    public List<Association> findAll(){
        return associationRepository.findAll();
    }

    public Association save(Association association){
        return associationRepository.save(association);
    }


}
