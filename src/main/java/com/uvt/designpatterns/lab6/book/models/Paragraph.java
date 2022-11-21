package com.uvt.designpatterns.lab6.book.models;

import com.uvt.designpatterns.lab6.book.services.AlignStrategy;
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

    public Paragraph(String paragraphName, String text){
        this.paragraphName = paragraphName;
        this.text = text;
    }





    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void add(Element element) {
    }

    @Override
    public void remove(Element element) {
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}