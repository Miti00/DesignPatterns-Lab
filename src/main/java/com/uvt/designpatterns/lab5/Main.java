package com.uvt.designpatterns.lab5;

import com.uvt.designpatterns.lab5.book.elements.Section;
import com.uvt.designpatterns.lab5.book.elements.paragraph.AlignCenter;
import com.uvt.designpatterns.lab5.book.elements.paragraph.AlignLeft;
import com.uvt.designpatterns.lab5.book.elements.paragraph.AlignRight;
import com.uvt.designpatterns.lab5.book.elements.paragraph.Paragraph;

public class Main {
    public static void main(String[] args) {

        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1", "Text Paragraph1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2", "Text Paragraph2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3", "Text Paragraph3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4", "Text Paragraph4");
        cap1.add(p4);

        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();

        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());
        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();
    }
}