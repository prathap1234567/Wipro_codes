package com.wipro.hibernatdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "passport")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "passport_number")
    private String passportNumber;

    // Constructors
    public Passport() {}

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    // toString
    @Override
    public String toString() {
        return "Passport [id=" + id +
                ", passportNumber=" + passportNumber + "]";
    }
}