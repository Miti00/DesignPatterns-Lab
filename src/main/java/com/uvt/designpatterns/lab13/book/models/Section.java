package com.uvt.designpatterns.lab13.book.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Section implements Element {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @OneToMany(targetEntity = Paragraph.class)
    private List<Element> elementList;

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
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }
}
