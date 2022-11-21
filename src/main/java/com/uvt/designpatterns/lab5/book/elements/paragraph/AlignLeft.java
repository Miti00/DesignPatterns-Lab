package com.uvt.designpatterns.lab5.book.elements.paragraph;

public class AlignLeft implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Paragraph: "+paragraph.getParagraphName() +"\n######" + paragraph.getText());
    }
}
