package com.ironhack.labjparelationshipandinheritance.model.nurse_association;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "association")
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    @OneToMany(mappedBy = "association", cascade = CascadeType.ALL)
    private List<Division> division = new ArrayList<>();

    public Association() {
    }


    public Association(String name, List<Division> division) {
        this.name = name;
        this.division = division;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Division> getDivision() {
        return division;
    }

    public void setDivision(List<Division> division) {
        this.division = division;
    }
}
