package com.trangtt.online_book_lib.repository;

import com.trangtt.online_book_lib.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
