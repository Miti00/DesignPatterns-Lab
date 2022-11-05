package com.uvt.designpatterns.lab2;

import com.uvt.designpatterns.lab2.book.Author;
import com.uvt.designpatterns.lab2.book.Book;
import com.uvt.designpatterns.lab2.book.Chapter;
import com.uvt.designpatterns.lab2.book.SubChapter;

public class Main {
    public static void main(String[] args) {

        Book discoTitanic = new Book("Disco Titanic");
        Author rpGeo = new Author("Radu Pavel Gheo");

        discoTitanic.addAuthor(rpGeo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);

        scOneOne.createElement("Paragraph1");
        scOneOne.createElement("Paragraph2");
        scOneOne.createElement("Paragraph3");
        scOneOne.createElement("Image 1");
        scOneOne.createElement("Paragraph4");
        scOneOne.createElement("Table 1");
        scOneOne.createElement("Paragraph5");

        scOneOne.print();
    }
}