package com.uvt.designpatterns.lab2.book.elements;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Table implements Element {
    private String tableTitle;

    @Override
    public void print(){
        System.out.println("Table with title: " + this.tableTitle);
    }
}