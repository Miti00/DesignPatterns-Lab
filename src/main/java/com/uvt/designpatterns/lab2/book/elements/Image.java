package com.uvt.designpatterns.lab2.book.elements;

import com.uvt.designpatterns.lab2.book.elements.Element;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Image implements Element {
    private String imageName;

    @Override
    public void print(){
        System.out.println("Image with name: " + imageName);
    }
}