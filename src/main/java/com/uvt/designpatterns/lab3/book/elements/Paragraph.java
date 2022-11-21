package com.uvt.designpatterns.lab3.book.elements;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Paragraph implements Element {
    private String paragraphName;
    private String text;

    public Paragraph(String paragraphName){
        this.paragraphName = paragraphName;
    }

    @Override
    public void print(){
        System.out.println("Paragraph: " + this.paragraphName);
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