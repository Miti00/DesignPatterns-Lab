package com.uvt.designpatterns.lab6.book.models;

public interface Element extends Visitee {

    void add(Element element);
    void remove(Element element);
    Element get(int index);

}