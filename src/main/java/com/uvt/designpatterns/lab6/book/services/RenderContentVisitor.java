package com.uvt.designpatterns.lab6.book.services;

import com.uvt.designpatterns.lab6.book.models.*;

public class RenderContentVisitor implements Visitor<Element> {
    @Override
    public void visitBook(Book book) {
        System.out.println("Book: " + book.getTitle());
        System.out.println();
        System.out.println("Authors:");
        book.getAuthors().forEach(Author::print);
        System.out.println();
        book.getContentList().forEach(element -> element.accept(this));
        System.out.println();
    }

    @Override
    public Element visitSection(Section section) {
        System.out.println(section.getTitle());
        section.getElementList().forEach(element -> element.accept(this));
        return section;
    }

    @Override
    public Element visitTableOfContents(TableOfContents tableOfContents) {
        System.out.println("Table of contents");
        return tableOfContents;
    }


    @Override
    public Element visitParagraph(Paragraph paragraph) {
        System.out.println("Paragraph: " + paragraph.getParagraphName() + "\n" + paragraph.getText());
        return paragraph;
    }

    @Override
    public Element visitImageProxy(ImageProxy imageProxy) {
        System.out.println("Image with name: " + imageProxy.getRealImage().getImageName());
        return imageProxy;
    }

    @Override
    public Element visitImage(Image image) {
        System.out.println("Image with name: " + image.getImageName());
        return image;
    }

    @Override
    public Element visitTable(Table table) {
        System.out.println("Table with title: " + table.getTableTitle());
        return table;
    }
}
