package com.ironhack.labjparelationshipandinheritance.demo;

import com.ironhack.labjparelationshipandinheritance.enums.GuestStatus;
import com.ironhack.labjparelationshipandinheritance.enums.MemberStatus;
import com.ironhack.labjparelationshipandinheritance.model.event_management_system.*;
import com.ironhack.labjparelationshipandinheritance.model.nurse_association.Association;
import com.ironhack.labjparelationshipandinheritance.model.nurse_association.Division;
import com.ironhack.labjparelationshipandinheritance.model.nurse_association.Member;
import com.ironhack.labjparelationshipandinheritance.repository.event_management_system.*;
import com.ironhack.labjparelationshipandinheritance.repository.nurse_association.AssociationRepository;
import com.ironhack.labjparelationshipandinheritance.repository.nurse_association.DivisionRepository;
import com.ironhack.labjparelationshipandinheritance.repository.nurse_association.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final AssociationRepository associationRepository;
    private final DivisionRepository divisionRepository;
    private final MemberRepository memberRepository;
    private final ConferenceRepository conferenceRepository;
    private final EventRepository eventRepository;
    private final ExhibitionRepository exhibitionRepository;
    private final SpeakerRepository speakerRepository;
    private final GuestRepository guestRepository;

    public DataLoader(AssociationRepository associationRepository,
                      DivisionRepository divisionRepository,
                      MemberRepository memberRepository, ConferenceRepository conferenceRepository,
                      EventRepository eventRepository, ExhibitionRepository exhibitionRepository,
                      SpeakerRepository speakerRepository, GuestRepository guestRepository) {
        this.associationRepository = associationRepository;
        this.divisionRepository = divisionRepository;
        this.memberRepository = memberRepository;
        this.conferenceRepository = conferenceRepository;
        this.eventRepository = eventRepository;
        this.exhibitionRepository = exhibitionRepository;
        this.speakerRepository = speakerRepository;
        this.guestRepository = guestRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //Create Association
        Association association = new Association();
        association.setName("Nurse Association of Spain");
        associationRepository.save(association);


        Division pediatric = new Division();
        pediatric.setDivision_name("Pediatric");
        pediatric.setDistrict("Andalusia");
        pediatric.setPresident("Eva Frau");
        pediatric.setAssociation(association);
        divisionRepository.save(pediatric);
//


        Division mental_health = new Division();
        mental_health.setDivision_name("Mental Health");
        mental_health.setDistrict("Miami");
        mental_health.setPresident("John Doe");
        mental_health.setAssociation(association);
        divisionRepository.save(mental_health);



        Division family_care = new Division();
        family_care.setDivision_name("Family Care");
        family_care.setDistrict("The Canary Islands");
        family_care.setPresident("Mary Sila");
        family_care.setAssociation(association);
        divisionRepository.save(family_care);



        Division surgical_care = new Division();
        surgical_care.setDivision_name("Surgical Care");
        surgical_care.setDistrict("Aragon");
        surgical_care.setPresident("Herr Muller");
        surgical_care.setAssociation(association);
        divisionRepository.save(surgical_care);



        Division obstetric = new Division();
        obstetric.setDivision_name("Obstetric");
        obstetric.setDistrict("Castilla");
        obstetric.setPresident("Jane Williams");
        obstetric.setAssociation(association);
        divisionRepository.save(obstetric);


        Division gerontological = new Division();
        gerontological.setDivision_name("Gerontological");
        gerontological.setDistrict("Catalonia");
        gerontological.setPresident("James Bond");
        gerontological.setAssociation(association);
        divisionRepository.save(gerontological);



        Division gynaecology =  new Division();
        gynaecology.setDivision_name("Gynaecology");
        gynaecology.setDistrict("Asturias");
        gynaecology.setPresident("Benny Lee");
        gynaecology.setAssociation(association);
        divisionRepository.save(gynaecology);


        //Members

        Member bookoons = new Member();
        bookoons.setName("Bookoons");
        bookoons.setStatus(MemberStatus.ACTIVE);
        bookoons.setRenewalDate(LocalDate.of(2017, 7, 24));
        bookoons.setDivision(pediatric);
        memberRepository.save(bookoons);



        Member tolu = new Member();
        tolu.setName("Tolu");
        tolu.setStatus(MemberStatus.LAPSED);
        tolu.setRenewalDate(LocalDate.of(2017, 5, 20));
        tolu.setDivision(pediatric);
        memberRepository.save(tolu);



        Member bolu = new Member();
        bolu.setName("Bolu");
        bolu.setStatus(MemberStatus.ACTIVE);
        bolu.setRenewalDate(LocalDate.of(2010, 2, 16));
        bolu.setDivision(pediatric);
        memberRepository.save(bolu);


        Member sarah = new Member();
        sarah.setName("Sarah");
        sarah.setStatus(MemberStatus.ACTIVE);
        sarah.setRenewalDate(LocalDate.of(2020, 4, 26));
        sarah.setDivision(pediatric);
        memberRepository.save(sarah);

        Member james = new Member();
        james.setName("James");
        james.setStatus(MemberStatus.LAPSED);
        james.setRenewalDate(LocalDate.of(2022, 9, 30));
        james.setDivision(pediatric);
        memberRepository.save(james);


        Member olaide = new Member();
        olaide.setName("Olaide");
        olaide.setStatus(MemberStatus.ACTIVE);
        olaide.setRenewalDate(LocalDate.of(2021, 8, 30));
        olaide.setDivision(pediatric);
        memberRepository.save(olaide);


        Member olami = new Member();
        olami.setName("Olami");
        olami.setStatus(MemberStatus.ACTIVE);
        olami.setRenewalDate(LocalDate.of(2018, 2, 22));
        olami.setDivision(pediatric);
        memberRepository.save(olami);


        //Event
        Event ydam = new Event();
        ydam.setEventName("Young Directors Annual Meeting");
        ydam.setDate(LocalDate.of(2018, 2, 22));
        ydam.setDuration(3);
        ydam.setLocation("Berlin");
        eventRepository.save(ydam);

        //Exhibition
        Exhibition exhibition1 = new Exhibition();
        exhibition1.setEventName("Young Directors Annual Meeting");
        exhibition1.setDate(LocalDate.of(2024, 5, 22));
        exhibition1.setDuration(2);
        exhibition1.setLocation("Potsdam");
        exhibition1.setTitle("Solo Exhibition");
        exhibitionRepository.save(exhibition1);

        Exhibition exhibition2 = new Exhibition();
        exhibition2.setEventName("Young Directors Annual Meeting");
        exhibition2.setTitle("Main Exhibition");
        exhibition2.setDate(LocalDate.of(2025, 10, 14));
        exhibition2.setDuration(5);
        exhibition2.setLocation("Neheim");
        exhibition2.setTitle("Artistic Exhibition");
        exhibitionRepository.save(exhibition2);

        //Guests
        Guest guest1 = new Guest();
        guest1.setName("Bella");
        guest1.setStatus(GuestStatus.ATTENDING);
        guest1.setEvent(ydam);
        guest1.setExhibition(exhibition2);
        guestRepository.save(guest1);

        Guest guest2 = new Guest();
        guest2.setName("Cole");
        guest2.setStatus(GuestStatus.NO_RESPONSE);
        guest2.setEvent(ydam);
        guest2.setExhibition(exhibition1);
        guestRepository.save(guest2);

        Guest guest3 = new Guest();
        guest3.setName("Daniel");
        guest3.setStatus(GuestStatus.ATTENDING);
        guest3.setEvent(ydam);
        guest3.setExhibition(exhibition2);
        guestRepository.save(guest3);


        //Conference
       Conference conference1 = new Conference();
       conference1.setTopic("Technological Innovation");
       conferenceRepository.save(conference1);

        //Speakers
        Speaker speaker1 = new Speaker();
        speaker1.setName("Betty");
        speaker1.setPresentationDuration(1);
        speaker1.setConference(conference1);
        speakerRepository.save(speaker1);

        Speaker speaker2 = new Speaker();
        speaker2.setName("Coal");
        speaker2.setPresentationDuration(2);
        speaker2.setConference(conference1);
        speakerRepository.save(speaker2);

        Speaker speaker3 = new Speaker();
        speaker3.setName("Disa");
        speaker3.setPresentationDuration(3);
        speaker3.setConference(conference1);
        speakerRepository.save(speaker3);
















    }



}
