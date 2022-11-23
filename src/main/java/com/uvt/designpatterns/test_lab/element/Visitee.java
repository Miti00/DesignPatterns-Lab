package com.uvt.designpatterns.test_lab.element;

import com.uvt.designpatterns.test_lab.visitor.Visitor;

public interface Visitee {

    void accept(Visitor visitor);
}
