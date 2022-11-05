package com.uvt.designpatterns.lab3;

import com.uvt.designpatterns.lab3.book.Author;
import com.uvt.designpatterns.lab3.book.Book;
import com.uvt.designpatterns.lab3.book.elements.Image;
import com.uvt.designpatterns.lab3.book.elements.Paragraph;
import com.uvt.designpatterns.lab3.book.elements.Section;

public class Main {
    public static void main(String[] args) {

        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGeo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGeo);

        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Capitolul 1.1.1.1");

        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
        noapteBuna.addContent(cap1);

        cap1.add(new Paragraph("Motto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));

        noapteBuna.print();

    }
}