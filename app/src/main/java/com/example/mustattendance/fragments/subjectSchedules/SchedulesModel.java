package com.example.mustattendance.fragments.subjectSchedules;

public class SchedulesModel {
    private String roomNo;
    private String lectureName;
    private String dateAndTime;
    private String instructor;

    public SchedulesModel(String roomNo, String lectureName, String dateAndTime, String instructor) {
        this.roomNo = roomNo;
        this.lectureName = lectureName;
        this.dateAndTime = dateAndTime;
        this.instructor = instructor;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
