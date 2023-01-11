package com.uvt.designpatterns.lab11_12.book.models;

import com.uvt.designpatterns.lab11_12.book.services.RenderContentVisitor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book implements Visitee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String title;
    @ManyToMany
    private List<Author> authors;

    @OneToMany(targetEntity = Section.class)
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

    public void print(){
        RenderContentVisitor visitor = new RenderContentVisitor();
        visitor.visitBook(this);
    }
}