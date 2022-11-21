package com.uvt.designpatterns.lab6.book.services;

import com.uvt.designpatterns.lab6.book.models.*;

public class BookStatistics<Element> implements Visitor<Element> {

    public void printStatitics(){
        System.out.println("Test");
    }

    @Override
    public Element visitBook(Book book) {
        return null;
    }

    @Override
    public Element visitSection(Section section) {
//
//        System.out.println("*** Number of sections " + numberOfSections);
//        return section;
    }

    @Override
    public Object visitTableOfContents(TableOfContents tableOfContents) {
        return tableOfContents;
    }

    @Override
    public Object visitParagraph(Paragraph paragraph) {
        return paragraph;
    }

    @Override
    public Object visitImageProxy(ImageProxy imageProxy) {
        return imageProxy;
    }

    @Override
    public Object visitImage(Image image) {
        return image;
    }

    @Override
    public Object visitTable(Table table) {
        return table;
    }
}
