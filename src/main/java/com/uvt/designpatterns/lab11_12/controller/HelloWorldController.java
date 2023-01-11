package com.uvt.designpatterns.lab11_12.controller;

import com.uvt.designpatterns.lab11_12.component.ClientComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private final ClientComponent clientComponent;

    @Autowired
    public HelloWorldController(ClientComponent clientComponent){
        this.clientComponent = clientComponent;
    }

    @GetMapping
    public String greeting() {
        return "Hello from ClientComponent = " + clientComponent;
    }
}
