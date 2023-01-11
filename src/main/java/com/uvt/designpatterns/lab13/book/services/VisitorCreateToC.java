package com.uvt.designpatterns.lab13.book.services;

import com.uvt.designpatterns.lab13.book.models.*;

public class VisitorCreateToC implements Visitor {

    private TableOfContents tableOfContents;

    @Override
    public void visitBook(Book book) {
        tableOfContents = book.getTableOfContents();
    }

    public TableOfContents getToC(){
        return tableOfContents;
    }


    @Override
    public Object visitSection(Section section) {
        return null;
    }

    @Override
    public Object visitTableOfContents(TableOfContents tableOfContents) {
        return null;
    }

    @Override
    public Object visitParagraph(Paragraph paragraph) {
        return null;
    }

    @Override
    public Object visitImageProxy(ImageProxy imageProxy) {
        return null;
    }

    @Override
    public Object visitImage(Image image) {
        return null;
    }

    @Override
    public Object visitTable(Table table) {
        return null;
    }
}
