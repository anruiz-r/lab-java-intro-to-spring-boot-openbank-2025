package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")

public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int patientId;

    private String name;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "admitted_by")
    private Employee admittedBy;


    public Patient() {

    }

    public Patient(int patientId, String name, String dateOfBirth, Employee admittedBy) {
        this.patientId = patientId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.admittedBy = admittedBy;
    }


    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Employee getAdmittedBy() {
        return admittedBy;
    }

    public void setAdmittedBy(Employee admittedBy) {
        this.admittedBy = admittedBy;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", admittedBy=" + admittedBy +
                '}';
    }
}

