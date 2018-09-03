package com.company.lab2;

public class Author {
    private String name;
    private String mail;
    private Gender gender;

    @Override
    public String toString() {
        return name;
    }
}

enum Gender {
    MALE,
    FEMALE
}
