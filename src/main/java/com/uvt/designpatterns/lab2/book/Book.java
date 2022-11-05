package com.uvt.designpatterns.lab2.book;

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
    private Author author;
    private List<Chapter> chapterList;


    public Book(final String title){
        this.title = title;
        this.chapterList = new ArrayList<>();
    }

    public int createChapter(final String chapterName){
        Chapter chapter = new Chapter(chapterName);
        chapterList.add(chapter);
        return chapterList.indexOf(chapter);
    }

    public Chapter getChapter(final int chapterIndex){
        return chapterList.get(chapterIndex);
    }


    public void addAuthor(Author author){
        this.setAuthor(author);
    }

    public void print(){
        System.out.println("Book title: " + this.title);
        System.out.println("Author name: " + this.author.getName());

        for(Chapter c : chapterList){
            System.out.println("Chapter: " + c.getChapterName());
        }
    }
}