package com.uvt.designpatterns.lab9_10.book.services;//package com.uvt.designpatterns.lab6.book.services;

import com.uvt.designpatterns.lab9_10.book.models.*;

public class BookStatistics implements Visitor<Element> {

    public void printStatitics() {
        System.out.println("Test");
    }

    @Override
    public void visitBook(Book book) {
        System.out.println("test");
    }

    @Override
    public Element visitSection(Section section) {
        return section;
    }

    @Override
    public Element visitTableOfContents(TableOfContents tableOfContents) {
        return tableOfContents;
    }

    @Override
    public Element visitParagraph(Paragraph paragraph) {
        return paragraph;
    }

    @Override
    public Element visitImageProxy(ImageProxy imageProxy) {
        return imageProxy;
    }

    @Override
    public Element visitImage(Image image) {
        return image;
    }

    @Override
    public Element visitTable(Table table) {
        return table;
    }
}
