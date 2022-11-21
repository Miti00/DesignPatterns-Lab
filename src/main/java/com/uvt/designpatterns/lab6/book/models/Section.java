package com.uvt.designpatterns.lab6.book.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Section implements Element, Visitee {
    private String title;
    List<Element> elementList;

    public Section(String title){
        this.title = title;
        elementList = new ArrayList<>();
    }

    @Override
    public void add(Element element){
        if(element != null && element != this){
            elementList.add(element);
        }
    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void print() {
        System.out.println(title);
        elementList.forEach(Element::print);
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
