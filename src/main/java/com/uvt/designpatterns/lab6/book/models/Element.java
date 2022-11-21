package com.uvt.designpatterns.lab6.book.models;

public interface Element {

    void print();

    void add(Element element);
    void remove(Element element);
    Element get(int index);

}