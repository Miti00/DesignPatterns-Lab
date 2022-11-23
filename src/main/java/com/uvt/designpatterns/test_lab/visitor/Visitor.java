package com.uvt.designpatterns.test_lab.visitor;

import com.uvt.designpatterns.test_lab.element.AnStudiu;
import com.uvt.designpatterns.test_lab.element.Grupa;
import com.uvt.designpatterns.test_lab.element.Student;
import com.uvt.designpatterns.test_lab.element.Subgrupa;

public interface Visitor<T> {

    T visitAn(AnStudiu anStudiu);

    T visitGrupa(Grupa grupa);

    T visitSubgrupa(Subgrupa subgrupa);

    T visitStudent(Student student);
}
