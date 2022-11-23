package com.uvt.designpatterns.test_lab;

import com.uvt.designpatterns.test_lab.element.*;
import com.uvt.designpatterns.test_lab.visitor.PrintVisitor;
import com.uvt.designpatterns.test_lab.visitor.Visitor;

public class Main {
    public static void main(String[] args) {

        Element info3 = new AnStudiu("Informatica 3")
                .add(new Grupa("Grupa 1"))
                    .add(new Subgrupa("Semigrupa 1.1"))
                        .add(new Student("Popescu I", "popescu@acme.edu"))
                        .add(new Student("Ionescu E", "ionescu`@acme.edu"))
                    .add(new Subgrupa("Semigrupa 1.2"))
                        .add(new Student("Vasilescu I", "vasilescu@acme.edu"))
                        .add(new Student("Georgescu E", "vasilescu@acme.edu"))
                .add(new Grupa("Grupa 2"));

        Visitor printVisitor = new PrintVisitor();
        info3.accept(printVisitor);

    }
}
