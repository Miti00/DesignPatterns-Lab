package com.uvt.designpatterns.test_lab.element;

import com.uvt.designpatterns.test_lab.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Grupa implements Element{

    private static final int MAX_LIMIT = 2;
    private String nume;
    private List<Element> subgrupe = new ArrayList<>();

    public Grupa(String nume) {
        this.nume = nume;
    }


    @Override
    public Grupa add(Element element) {
        if (subgrupe.size() < MAX_LIMIT) {
            if(element instanceof Subgrupa subgrupa) {
                this.subgrupe.add(subgrupa);
                return this;
            }else{
                throw new IllegalStateException("Max limit reached in this group for semigroups");
            }
        } else {
            throw new IllegalStateException("element added in group not semigroup");
        }
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitGrupa(this);
    }
}
