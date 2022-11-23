package com.uvt.designpatterns.test_lab.element;

import com.uvt.designpatterns.test_lab.visitor.Visitor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Element, Visitee {
    private String nume;
    private String email;

    @Override
    public Element add(Element element) {

        return element;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitStudent(this);
    }
}
