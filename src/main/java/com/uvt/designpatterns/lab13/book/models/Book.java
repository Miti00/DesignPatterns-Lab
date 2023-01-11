package com.uvt.designpatterns.lab13.book.models;

import com.uvt.designpatterns.lab13.book.services.Observer;
import com.uvt.designpatterns.lab13.book.services.RenderContentVisitor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Book implements Visitee {

    private Integer id;
    private String title;
    private List<Author> authors;
    private List<Element> contentList = new ArrayList<>();

    private TableOfContents tableOfContents;
    private List<Observer> observers = new ArrayList<>();

    public Book(final String title){
        this.title = title;
        this.authors = new ArrayList<>();
        this.contentList = new ArrayList<>();
    }

    public void addContent(Element element){
        if(element != null) {
            contentList.add(element);
            notifyObservers();
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

    public void print(){
        RenderContentVisitor visitor = new RenderContentVisitor();
        visitor.visitBook(this);
    }


    public void registerObserver(Observer observer) {
        this.observers.add(observer);

    }

    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        this.observers.forEach(Observer::update);
    }

}