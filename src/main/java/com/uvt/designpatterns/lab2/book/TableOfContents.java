package com.uvt.designpatterns.lab2.book;

import lombok.*;

@Getter
@Setter
@ToString
public class TableOfContents {

    public void print(){
        System.out.println(this.toString());
    }
}