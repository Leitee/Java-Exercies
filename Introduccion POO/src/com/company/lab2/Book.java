package com.company.lab2;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getAuthorsName(){
        return String.format("s%, ",this.authors);
    }

    @Override
    public String toString() {
        return String.format("name: s%, price: f%, quantity: d%",
                this.name, this.price, this.qty);
    }
}
