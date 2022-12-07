package com.uvt.designpatterns.test_lab.visitor;

import com.uvt.designpatterns.test_lab.element.*;

public class PrintVisitor implements Visitor {
    @Override
    public Object visitAn(AnStudiu anStudiu) {
        System.out.println(anStudiu.getNume());
        anStudiu.getElementList().forEach(element -> element.accept(this));
        return anStudiu;
    }

    @Override
    public Object visitGrupa(Grupa grupa) {
        System.out.println("\t" + grupa.getNume());
        return grupa;
    }

    @Override
    public Object visitSubgrupa(Subgrupa subgrupa) {
        System.out.println("\t\t" + subgrupa.getNume());
        return subgrupa;
    }

    @Override
    public Object visitStudent(Student student) {
        System.out.println("\t\t\t" + student.getNume() + ", " + student.getEmail());
        return student;
    }
}
