package com.company.lab2;

public class Papper {
    private String text;

    public void write(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
