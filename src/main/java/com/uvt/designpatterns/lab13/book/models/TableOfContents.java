package com.uvt.designpatterns.lab13.book.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class TableOfContents implements Element, Visitee {

    private List<Element> contentList;

    @Override
    public void add(Element element) {
        contentList.add(element);
    }

    @Override
    public void remove(Element element) {
        contentList.remove(element);
    }

    @Override
    public Element get(int index) {
        return contentList.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}