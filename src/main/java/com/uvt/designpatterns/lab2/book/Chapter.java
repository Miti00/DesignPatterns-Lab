
package com.uvt.designpatterns.lab2.book;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Chapter {
    private String chapterName;
    private List<SubChapter> subChapterList;


    public Chapter(String chapterName){
        this.chapterName = chapterName;
        this.subChapterList = new ArrayList<>();
    }

    public int createSubChapter(final String subChapterName){
        SubChapter subChapter = new SubChapter(subChapterName);
        subChapterList.add(subChapter);
        return subChapterList.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int subChapterIndex) {
        return subChapterList.get(subChapterIndex);
    }

    public void print(){
        System.out.println("Chapter name: " + this.getChapterName());

        for(SubChapter sc : subChapterList){
            System.out.println("Subchapter: " + sc.getSubChapterName());
            sc.print();
        }
    }

}