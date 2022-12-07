package com.uvt.designpatterns.lab9_10.book.services;

import com.uvt.designpatterns.lab9_10.book.models.Paragraph;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        System.out.println("Paragraph: "+paragraph.getParagraphName() +"\n###" + paragraph.getText() +"###");
    }
}
