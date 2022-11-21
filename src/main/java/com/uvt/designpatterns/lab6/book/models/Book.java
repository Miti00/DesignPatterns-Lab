package com.uvt.designpatterns.lab6.book.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Book implements Visitee{
    private String title;
    private List<Author> authors;
    private List<Element> contentList;


    public Book(final String title){
        this.title = title;
        this.authors = new ArrayList<>();
        this.contentList = new ArrayList<>();
    }

    public void addContent(Element element){
        if(element != null) {
            contentList.add(element);
        }
    }

    public void addAuthor(Author author){
        if(author != null){
            authors.add(author);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
    }
}