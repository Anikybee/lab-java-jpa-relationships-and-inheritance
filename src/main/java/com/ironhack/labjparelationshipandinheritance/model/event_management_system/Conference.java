package com.ironhack.labjparelationshipandinheritance.model.event_management_system;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "conference")
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String topic;

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speaker = new ArrayList<>();

    public Conference(String topic, List<Speaker> speaker) {
        this.speaker = speaker;
        this.topic = topic;
    }

    public Conference() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public  List<Speaker> getSpeaker() {
        return speaker;
    }

    public void setSpeaker(List<Speaker> speaker) {
        this.speaker = speaker;
    }
}
