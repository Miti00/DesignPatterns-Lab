package com.uvt.designpatterns.lab11_12;

import com.uvt.designpatterns.lab11_12.book.models.Author;
import com.uvt.designpatterns.lab11_12.book.models.Book;
import com.uvt.designpatterns.lab11_12.book.models.Paragraph;
import com.uvt.designpatterns.lab11_12.book.models.Section;
import com.uvt.designpatterns.lab11_12.book.services.DocumentManager;
import com.uvt.designpatterns.lab11_12.component.ClientComponent;
import com.uvt.designpatterns.lab11_12.component.SingletonComponent;
import com.uvt.designpatterns.lab11_12.component.TransientComponent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@SpringBootApplication
public class MainApp {


    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(EntityManagerFactory entityManagerFactory) {
        return args -> {
            EntityManager em = entityManagerFactory.createEntityManager();
            Book testBook = testBook();
            em.getTransaction().begin();
            em.persist(testBook);
            em.getTransaction().commit();
            em.close();
        };
    }

    private Book testBook() {
        Book book = new Book("MyBook");
        Author author = new Author("My Self");
        book.addAuthor(author);
        Section cap1 = new Section("Capitolul 1");
        book.addContent(cap1);
        Paragraph p1 = new Paragraph("Title Paragraph 1", "Text Paragraph 1");
        book.addContent(p1);
        Paragraph p2 = new Paragraph("Title Paragraph 2", "Text Paragraph 2");
        book.addContent(p2);
        Paragraph p3 = new Paragraph("Title Paragraph 3", "Text Paragraph 3");
        book.addContent(p3);
        Paragraph p4 = new Paragraph("Title Paragraph 4", "Text Paragraph 4");
        book.addContent(p4);
        Paragraph p5 = new Paragraph("Title Paragraph 5", "Text Paragraph 5");
        book.addContent(p5);
        return book;
    }
}