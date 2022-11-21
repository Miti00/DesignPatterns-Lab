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
public class Paragraph implements Element, Visitee {
    private String paragraphName;
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String paragraphName, String text){
        this.paragraphName = paragraphName;
        this.text = text;
    }

    @Override
    public void print(){
        if(alignStrategy == null){
            System.out.println("Paragraph: " + this.paragraphName + "\n" + this.text);
        }else{
            alignStrategy.render(this);
        }
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

    }
}