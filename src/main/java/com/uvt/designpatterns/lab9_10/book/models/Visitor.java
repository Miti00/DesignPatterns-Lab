package com.uvt.designpatterns.lab9_10.book.models;

public interface Visitor<T>{
    void visitBook(Book book);
    T visitSection(Section section);
    T visitTableOfContents(TableOfContents tableOfContents);
    T visitParagraph(Paragraph paragraph);
    T visitImageProxy(ImageProxy imageProxy);
    T visitImage(Image image);
    T visitTable(Table table);
}
