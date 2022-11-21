package com.uvt.designpatterns.lab3.book.elements;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TableOfContents implements Element {

    public void print(){
        System.out.println(this.toString());
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }
}