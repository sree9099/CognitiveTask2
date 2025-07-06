package com.library;

public class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book info
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    // 🔽 This is the main() method. Add this to run the program.
    public static void main(String[] args) {
        Book myBook = new Book("The Alchemist", "Paulo Coelho");
        myBook.displayBookInfo();
    }
}
