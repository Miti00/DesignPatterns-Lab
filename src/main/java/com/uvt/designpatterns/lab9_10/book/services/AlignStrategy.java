package com.uvt.designpatterns.lab9_10.book.services;

import com.uvt.designpatterns.lab9_10.book.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph paragraph);
}

