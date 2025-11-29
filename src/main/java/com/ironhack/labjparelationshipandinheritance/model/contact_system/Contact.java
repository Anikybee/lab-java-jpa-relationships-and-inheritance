package com.ironhack.labjparelationshipandinheritance.model.contact_system;

import jakarta.persistence.*;

public class Contact {

    @Id
    @GeneratedValue (strategy = GenerationType.TABLE)
    private int id;

    @Column (name = "company")
    private String company;

    @Column (name = "title")
    private String title;

    @Embedded
    private Name name;

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public Contact() {
    }

    public Contact(String company, String title) {
        this.company = company;
        this.title = title;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
