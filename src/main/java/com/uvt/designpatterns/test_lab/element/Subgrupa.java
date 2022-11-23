package com.uvt.designpatterns.test_lab.element;


import com.uvt.designpatterns.test_lab.visitor.Visitor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Subgrupa implements Element, Visitee {

    private static final int MAX_STUDENTS = 15;
    private List<Student> studentList = new ArrayList<>();
    private String nume;

    public Subgrupa(String nume) {
        this.nume = nume;
    }


    @Override
    public Subgrupa add(Element element) {
        if (element instanceof Student student) {
            if (studentList.size() < 15) {
                studentList.add(student);
                return this;
            } else {
                System.out.println("Max limit reached");
                return null;
            }
        } else {
            throw new IllegalStateException("element added in semigroup not student");
        }
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitSubgrupa(this);
    }
}
