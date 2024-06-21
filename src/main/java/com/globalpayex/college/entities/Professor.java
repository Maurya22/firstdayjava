package com.globalpayex.college.entities;

import abc.salary.SalariedIndividual;

public class Professor extends CollegeUser implements SalariedIndividual {

    private String[] subjects;
    private int noOfDaysWork;
    private int costPerDay;
    static int count;


    public Professor(String name, char gender, String[] subjects, int noOfDaysWork, int costPerDay) {
        super(name, gender);
        count++;
        this.subjects = subjects;
        this.noOfDaysWork=noOfDaysWork;
        this.costPerDay=costPerDay;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }


    @Override
    public int getDaysWorkedInMonth() {
        return this.noOfDaysWork;
    }

    @Override
    public int getCommercialPerDays() {
        return this.costPerDay;
    }
}
