package com.uvt.designpatterns.lab13.book.services;

public class AlignStrategyFactory {

    public AlignStrategy createStrategy(String textAlignment) {
        return switch (textAlignment) {
            case "right" -> new AlignRight();
            case "center" -> new AlignCenter();
            default -> new AlignLeft();
        };
    }
}
