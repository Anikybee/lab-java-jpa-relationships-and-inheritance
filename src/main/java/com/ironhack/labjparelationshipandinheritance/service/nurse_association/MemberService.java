package com.ironhack.labjparelationshipandinheritance.service.nurse_association;

import com.ironhack.labjparelationshipandinheritance.model.nurse_association.Member;
import com.ironhack.labjparelationshipandinheritance.repository.nurse_association.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> findAll(){
        return memberRepository.findAll();
    }

    public Member save(Member member){
        return memberRepository.save(member);
    }


}
