package com.uvt.designpatterns.test_lab.visitor;

import com.uvt.designpatterns.test_lab.element.*;

public class PrintVisitor implements Visitor {
    @Override
    public Object visitAn(AnStudiu anStudiu) {
        System.out.println(anStudiu.getNume());
        anStudiu.getElementList().forEach(grupa -> grupa.accept(this));
        return anStudiu;
    }

    @Override
    public Object visitGrupa(Grupa grupa) {
        System.out.println("\t" + grupa.getNume());
        grupa.getSubgrupe().forEach(subgrupa -> subgrupa.accept(this));
        return grupa;
    }

    @Override
    public Object visitSubgrupa(Subgrupa subgrupa) {
        System.out.println("\t\t" + subgrupa.getNume());
        subgrupa.getStudentList().forEach(student -> student.accept(this));
        return subgrupa;
    }

    @Override
    public Object visitStudent(Student student) {
        System.out.println("\t\t\t" + student.getNume() + ", " + student.getEmail());
        return student;
    }
}
