package com.uvt.designpatterns.lab5.book.elements;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Table implements Element {
    private String tableTitle;

    @Override
    public void print(){
        System.out.println("Table with title: " + this.tableTitle);
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