package com.uvt.designpatterns.lab9_10;

import com.uvt.designpatterns.lab9_10.book.models.*;
import com.uvt.designpatterns.lab9_10.book.services.DocumentManager;
import com.uvt.designpatterns.lab9_10.component.ClientComponent;
import com.uvt.designpatterns.lab9_10.component.SingletonComponent;
import com.uvt.designpatterns.lab9_10.component.TransientComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApp {


    public static void main(String[] args) {


        ApplicationContext applicationContext = SpringApplication.run(MainApp.class, args);

        TransientComponent transientBean = applicationContext.getBean(TransientComponent.class);
        transientBean.operation();

        SingletonComponent singletonBean = applicationContext.getBean(SingletonComponent.class);
        singletonBean.operation();

        singletonBean = applicationContext.getBean(SingletonComponent.class);
        singletonBean.operation();

        ClientComponent c = applicationContext.getBean(ClientComponent.class);
        c.operation();

        c = (ClientComponent)applicationContext.getBean("clientComponent");
        c.operation();



    }
}