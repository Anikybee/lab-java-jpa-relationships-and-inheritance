package com.ironhack.labjparelationshipandinheritance.model.contact_system;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Name {

    @Column (name = "salutation")
    private String salutation;

    @Column (name = "first_name")
    private String firstName;

    @Column (name = "middle_name")
    private String middleName;

    @Column (name = "last_name")
    private String lastName;

    @Override
    public String toString() {
        return "Name{" +
                "salutation='" + salutation + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Name() {
    }

    public Name(String salutation, String lastName, String middleName, String firstName) {
        this.salutation = salutation;
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
