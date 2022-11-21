package com.uvt.designpatterns.lab3.book.elements;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Image implements Element {
    private String imageName;
    private String url;

    public Image(String imageName){
        this.imageName = imageName;
    }

    @Override
    public void print(){
        System.out.println("Image with name: " + imageName);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }
}