package com.uvt.designpatterns.lab11_12.book.services;

import com.uvt.designpatterns.lab11_12.book.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph paragraph);
}

