package com.uvt.designpatterns.lab2.book;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private String name;

    public void print(){
        System.out.println("Author name: " + this.name);
    }
}