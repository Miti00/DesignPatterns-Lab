package com.uvt.designpatterns.lab5.book.elements.picture;

import com.uvt.designpatterns.lab5.book.elements.Element;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ImageProxy implements Element, Picture {
    private String imageName;
    private String url;
    private Dimension dim;
    private Image realImage;


    public ImageProxy(String imageName) {
        this.imageName = imageName;
        this.realImage = loadImage();
    }

    public Image loadImage(){
        if(realImage == null){
            realImage = new Image(imageName);
        }
        return realImage;
    }

    @Override
    public void print() {
        realImage.print();
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
}
