package com.uvt.designpatterns.lab13.book.services;

import com.uvt.designpatterns.lab13.book.models.Book;
import com.uvt.designpatterns.lab13.book.models.Visitor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ObserverUpdateToC implements Observer{
    private Book book;

    @Override
    public void update() {
        VisitorCreateToC toc = new VisitorCreateToC();
        book.accept(toc);
        book.setTableOfContents(toc.getToC());
        System.out.println("ToC updated;");
    }




}
