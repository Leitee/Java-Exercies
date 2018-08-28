package com.company.lab2;

public class VideoGame extends RentalItem {
    private String title;
    private int cantHoras = 10;
    private String gender;
    private String company;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public VideoGame() { }

    public VideoGame(String title, String company) {
        this.title = title;
        this.company = company;
    }

    public VideoGame(String title, int cantHoras, String gender, String company) {
        this.title = title;
        this.cantHoras = cantHoras;
        this.gender = gender;
        this.company = company;
    }
}
