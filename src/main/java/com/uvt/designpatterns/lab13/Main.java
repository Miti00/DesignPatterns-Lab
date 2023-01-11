package com.uvt.designpatterns.lab13;


import com.uvt.designpatterns.lab13.book.models.Book;
import com.uvt.designpatterns.lab13.book.models.Paragraph;
import com.uvt.designpatterns.lab13.book.services.Observer;
import com.uvt.designpatterns.lab13.book.services.ObserverUpdateToC;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("My Book");
        ObserverUpdateToC observer = new ObserverUpdateToC(book);
        book.registerObserver(observer);
        book.addContent(new Paragraph("Title paragraph 1", "Text paragraph 1"));
        System.out.println(observer.getBook().getContentList());
    }
}
