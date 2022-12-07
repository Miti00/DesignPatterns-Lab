package com.uvt.designpatterns.lab9_10;

import com.uvt.designpatterns.lab9_10.book.models.Author;
import com.uvt.designpatterns.lab9_10.book.models.Book;
import com.uvt.designpatterns.lab9_10.book.models.Paragraph;
import com.uvt.designpatterns.lab9_10.book.models.Section;
import com.uvt.designpatterns.lab9_10.book.services.DocumentManager;

public class Main {
    public static void printing() {
        DocumentManager.getInstance().getBook().print();
    }

    public static void main(String[] args) {
        Book book = new Book("MyBook");
        DocumentManager.getInstance().setBook(book);

        Author author = new Author("My Self");
        book.addAuthor(author);

        Section cap1 = new Section("Capitolul 1");
        book.addContent(cap1);

        Paragraph p1 = new Paragraph("Title Paragraph 1", "Text Paragraph 1");
        book.addContent(p1);
        Paragraph p2 = new Paragraph("Title Paragraph 2", "Text Paragraph 2");
        book.addContent(p2);
        Paragraph p3 = new Paragraph("Title Paragraph 3", "Text Paragraph 3");
        book.addContent(p3);
        Paragraph p4 = new Paragraph("Title Paragraph 4", "Text Paragraph 4");
        book.addContent(p4);
        Paragraph p5 = new Paragraph("Title Paragraph 5", "Text Paragraph 5");
        book.addContent(p5);

        printing();
    }
}
