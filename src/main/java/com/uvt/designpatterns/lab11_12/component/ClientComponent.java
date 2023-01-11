package com.uvt.designpatterns.lab11_12.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientComponent {
    private final TransientComponent transientComponent;
    private final SingletonComponent singletonComponent;

    @Autowired
    public ClientComponent(TransientComponent transientComponent, SingletonComponent singletonComponent) {
        this.transientComponent = transientComponent;
        this.singletonComponent = singletonComponent;

        System.out.println("ClientComponent::ClientComponent = " + this);
        System.out.println(" o SingletonComponent = " + singletonComponent);
        System.out.println(" o TransientComponent = " + transientComponent);
    }

    public void operation() {
        System.out.println("Invoked ClientComponent::operation() on " + this);
        System.out.println(" o SingletonComponent = " + singletonComponent);
        System.out.println(" o TransientComponent = " + transientComponent);
    }
}
