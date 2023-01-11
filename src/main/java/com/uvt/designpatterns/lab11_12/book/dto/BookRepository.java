package com.uvt.designpatterns.lab11_12.book.dto;

import com.uvt.designpatterns.lab11_12.book.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
