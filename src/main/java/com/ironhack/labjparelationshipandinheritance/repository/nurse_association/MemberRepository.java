package com.ironhack.labjparelationshipandinheritance.repository.nurse_association;


import com.ironhack.labjparelationshipandinheritance.model.nurse_association.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
