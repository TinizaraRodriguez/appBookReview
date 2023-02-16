package com.inerza.ulpgc.demo.bookReview.core.repositories;


import com.inerza.ulpgc.demo.bookReview.model.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepository extends JpaRepository<Book, Long>, PagingAndSortingRepository<Book, Long> {
}