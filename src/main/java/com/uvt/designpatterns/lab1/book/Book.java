package com.uvt.designpatterns.lab1.book;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Book {
    private String title;
    private List<Paragraph> paragraphList;
    private List<Image> imageList;
    private List<Table> tableList;

    public Book(final String title){
        this.title = title;
        paragraphList = new ArrayList<>();
        imageList = new ArrayList<>();
        tableList = new ArrayList<>();
    }

    public void createNewParagraph(final String paragraphTitle){
        Paragraph paragraph = new Paragraph(paragraphTitle);
        this.paragraphList.add(paragraph);
    }

    public void createNewImage(final String imageTitle){
        Image image = new Image(imageTitle);
        this.imageList.add(image);
    }

    public void createNewTable(final String tableTitle){
        Table table = new Table(tableTitle);
        this.tableList.add(table);
    }

    public void print(){
        System.out.println(this);
    }
}
