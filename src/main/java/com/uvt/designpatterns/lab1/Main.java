package com.uvt.designpatterns.lab1;

import com.uvt.designpatterns.lab1.book.Book;

public class Main {
    public static void main(String[] args) {

        Book discoTitanic = new Book("Disco Titanic");
        discoTitanic.createNewParagraph("Paragraph1");
        discoTitanic.createNewParagraph("Paragraph2");
        discoTitanic.createNewParagraph("Paragraph3");
        discoTitanic.createNewImage("Image 1");
        discoTitanic.createNewParagraph("Paragraph4");
        discoTitanic.createNewTable("Table 1");
        discoTitanic.createNewParagraph("Paragraph5");

        discoTitanic.print();
    }
}
