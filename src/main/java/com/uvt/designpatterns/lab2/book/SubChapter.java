package com.uvt.designpatterns.lab2.book;

import com.uvt.designpatterns.lab2.book.elements.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SubChapter {
    private String subChapterName;
    //    private List<Paragraph> paragraphList;
//    private List<Image> imageList;
//    private List<Table> tableList;
    private List<Element> elementList;

    public SubChapter(String subChapterName){
        this.subChapterName = subChapterName;
//        paragraphList = new ArrayList<>();
//        imageList = new ArrayList<>();
//        tableList = new ArrayList<>();
        this.elementList = new ArrayList<>();
    }

    public void createElement(final String title){
        Element element;
        if(title.toLowerCase().contains("paragraph")){
            element = new Paragraph(title);
        }else if(title.toLowerCase().contains("image")){
            element = new Image(title);
        }else if(title.toLowerCase().contains("table")){
            element = new Table(title);
        }else{
            throw new IllegalStateException("Cannot add this element");
        }

        elementList.add(element);
    }
//
//    public void createNewParagraph(final String paragraphTitle){
//        Paragraph paragraph = new Paragraph(paragraphTitle);
//        this.paragraphList.add(paragraph);
//    }
//
//    public void createNewImage(final String imageTitle){
//        Image image = new Image(imageTitle);
//        this.imageList.add(image);
//    }
//
//    public void createNewTable(final String tableTitle){
//        Table table = new Table(tableTitle);
//        this.tableList.add(table);
//    }


    public void print(){
        System.out.println("Subchapter: " + this.subChapterName);
        for(Element el : elementList){
            el.print();
        }
//        for(Paragraph p : paragraphList){
//            p.print();
//        }
//
//        for(Image i : imageList){
//            i.print();
//        }
//
//        for(Table t: tableList){
//            t.print();
//        }
    }
}