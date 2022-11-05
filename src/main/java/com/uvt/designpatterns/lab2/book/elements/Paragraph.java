package com.uvt.designpatterns.lab2.book.elements;

import com.uvt.designpatterns.lab2.book.elements.Element;
import lombok.*;

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
}