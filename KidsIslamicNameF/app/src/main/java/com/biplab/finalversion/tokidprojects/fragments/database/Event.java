package com.biplab.dcl.tokidprojects.fragments.database;

public class Event {
    private int id;
    private String title;
    private int day;
    private int month;
    private int year;

    public Event(int id, String title, int day, int month, int year) {

        this.id = id;
        this.title = title;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Event(String title, int day, int month, int year) {
        this.title = title;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}