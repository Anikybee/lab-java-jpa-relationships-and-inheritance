package com.ironhack.labjparelationshipandinheritance.model.event_management_system;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity (name = "event")
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String eventName;
    private LocalDate date;
    private int duration;
    private String Location;

    @OneToMany (mappedBy = "event", cascade = CascadeType.ALL)
    private List<Guest> guest = new ArrayList<>();


    public Event() {
    }

    public Event(String eventName, LocalDate date, int duration, String location, List<Guest> guest) {
        this.eventName = eventName;
        this.date = date;
        this.duration = duration;
        Location = location;
        this.guest = guest;
    }

    public Event(String eventName, LocalDate date, int duration, String location) {
        this.eventName = eventName;
        this.date = date;
        this.duration = duration;
        Location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public List<Guest> getGuest() {
        return guest;
    }

    public void setGuest(List<Guest> guest) {
        this.guest = guest;
    }
}
