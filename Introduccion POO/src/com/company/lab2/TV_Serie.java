package com.company.lab2;

public class TV_Serie extends RentalItem {
    private String title;
    private int cantTemp = 3;
    private String gender;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public TV_Serie() {}

    public TV_Serie(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public TV_Serie(String title, int cantTemp, String gender, String author) {
        this.title = title;
        this.cantTemp = cantTemp;
        this.gender = gender;
        this.author = author;
    }
}
