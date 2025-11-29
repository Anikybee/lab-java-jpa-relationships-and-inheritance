package com.ironhack.labjparelationshipandinheritance.model.event_management_system;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Exhibition extends Event {

    String title;

    @OneToMany (mappedBy = "exhibition", cascade = CascadeType.ALL)
    private List<Guest> guest =  new ArrayList<>();


    public Exhibition() {
    }

    public Exhibition(String title, List<Guest> guest) {
        this.title = title;
        this.guest = guest;
    }

    public Exhibition(String eventName, LocalDate date, int duration, String location, String title, List<Guest> guest) {
        super(eventName, date, duration, location);
        this.title = title;
        this.guest = guest;
    }

    @Override
    public List<Guest> getGuest() {
        return guest;
    }

    public void setGuest(List<Guest> guest) {
        this.guest = guest;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
