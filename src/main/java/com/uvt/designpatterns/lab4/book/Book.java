package com.uvt.designpatterns.lab4.book;

import com.uvt.designpatterns.lab4.book.elements.Element;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Book {
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

    public void print(){
        System.out.println("Book: " + this.title);
        System.out.println();
        System.out.println("Authors:");
        authors.forEach(Author::print);
        System.out.println();
        contentList.forEach(Element::print);
        System.out.println();
    }
}