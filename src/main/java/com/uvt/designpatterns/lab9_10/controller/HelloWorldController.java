package com.uvt.designpatterns.lab9_10.controller;

import com.uvt.designpatterns.lab9_10.component.ClientComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
