package com.uvt.designpatterns.lab6.book.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.TimeUnit;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Image implements Element, Picture {
    private String imageName;
    private String url;
    private PictureContent imageContent;

    public Image(String imageName){
        this.imageName = imageName;
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

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dimension() {
        return null;
    }

    @Override
    public PictureContent content() {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}