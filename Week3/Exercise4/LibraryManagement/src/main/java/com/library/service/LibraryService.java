package com.library.service;

import org.springframework.stereotype.Component;
import com.library.model.Book;

@Component
public class LibraryService {

    public void showLibraryBook() {
        Book book = new Book("The Silent Voice", "Sierra Luna");
        book.displayBookInfo();
    }
}
