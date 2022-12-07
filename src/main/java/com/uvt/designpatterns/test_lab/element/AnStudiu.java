package com.uvt.designpatterns.test_lab.element;

import com.uvt.designpatterns.test_lab.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class AnStudiu implements Element {

    private String nume;
    private List<Element> elementList = new ArrayList<>();

    public AnStudiu(String nume) {
        this.nume = nume;
    }


    @Override
    public AnStudiu add(Element element) {
            this.elementList.add(element);
            return this;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitAn(this);
    }
}
