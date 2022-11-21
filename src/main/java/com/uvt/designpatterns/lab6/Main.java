package com.uvt.designpatterns.lab6;

import com.uvt.designpatterns.lab6.book.models.*;
import com.uvt.designpatterns.lab6.book.services.AlignCenter;
import com.uvt.designpatterns.lab6.book.services.AlignLeft;
import com.uvt.designpatterns.lab6.book.services.AlignRight;
import com.uvt.designpatterns.lab6.book.services.RenderContentVisitor;
//import com.uvt.designpatterns.lab6.book.services.BookStatistics;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Visitor patterns are fun");
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1", "Text 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2", "Text 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3", "Text 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4", "Text 4");
        cap1.add(p4);

        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some Paragraph","Some text"));
        cap1.add(new Table("Table 1"));

        book.addContent(cap1);

//        BookStatistics stats = new BookStatistics();
//        cap1.accept(stats);
//        stats.printStatitics();

        RenderContentVisitor renderContentVisitor = new RenderContentVisitor();
        book.accept(renderContentVisitor);

    }
}