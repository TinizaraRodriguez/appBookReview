package com.inerza.ulpgc.demo.bookReview.core.persistence;


import com.inerza.ulpgc.demo.bookReview.model.entities.Book;

import java.util.List;

public interface IBookService {

    List<Book> getBookList(int page, int size, String sortDir, String sort);
}