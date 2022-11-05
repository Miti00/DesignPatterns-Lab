package com.uvt.designpatterns.lab4.book.elements;

public interface Element {

    void print();

    void add(Element element);
    void remove(Element element);
    Element get(int index);

}