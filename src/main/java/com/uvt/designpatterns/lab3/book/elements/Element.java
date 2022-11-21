package com.uvt.designpatterns.lab3.book.elements;

public interface Element {

    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int index);
}