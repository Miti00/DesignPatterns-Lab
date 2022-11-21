package com.uvt.designpatterns.lab6.book.services;

import com.uvt.designpatterns.lab6.book.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph paragraph);
}

