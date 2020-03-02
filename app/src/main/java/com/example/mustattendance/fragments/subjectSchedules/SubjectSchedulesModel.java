package com.example.mustattendance.fragments.subjectSchedules;

public class SubjectSchedulesModel {
    private String dayName ;

    public SubjectSchedulesModel(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }
}
