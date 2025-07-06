package com.library.model;

public class Book {
    private String title;
    private String author;

    public Book() {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
