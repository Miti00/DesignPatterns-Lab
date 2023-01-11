package com.uvt.designpatterns.lab11_12.book.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Paragraph implements Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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