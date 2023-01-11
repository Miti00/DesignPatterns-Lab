package com.uvt.designpatterns.lab11_12.book.services;

import com.uvt.designpatterns.lab11_12.book.models.Book;

public class DocumentManager {

    private static DocumentManager instance;
    private Book book;

    private DocumentManager() {
    }

    public static DocumentManager getInstance() {
        if (instance == null) {
            instance = new DocumentManager();
        }
        return instance;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
