package dev.decagon.applicant;

import dev.decagon.person.Person;

import java.time.LocalDate;
import java.util.Date;

public class Applicant extends Person {
    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public QUALIFICATION getHighestQualification() {
        return highestQualification;
    }

    public void setHighestQualification(QUALIFICATION highestQualification) {
        this.highestQualification = highestQualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    private String aid;
    private LocalDate applicationDate;
    private QUALIFICATION highestQualification;
    private String experience;

    public Applicant() {

    }

    public Applicant(LocalDate applicationDate, QUALIFICATION highestQualification, String experience) {
        this.applicationDate = applicationDate;
        this.highestQualification = highestQualification;
        this.experience = experience;
    }

    @Override
    public String register() {
        return new ApplicationServiceImple().applyForJob();
    }
}
