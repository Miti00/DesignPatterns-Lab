package com.uvt.designpatterns.lab13.book.services;

import com.uvt.designpatterns.lab11_12.book.models.Paragraph;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Paragraph: "+paragraph.getParagraphName() +"\n######" + paragraph.getText());
    }
}
