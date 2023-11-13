package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void addBook() {
        //given
        BookService bookService = new BookService();
        BookDto bookDto1 = new BookDto("Harry Potter and the Philosopher's Stone", "J. K. Rowling");
        BookDto bookDto2 = new BookDto("Harry Potter and the Chamber of Secrets", "J. K. Rowling");
        BookDto bookDto3 = new BookDto("Harry Potter and the Prisoner of Azkaban", "J. K. Rowling");
        BookDto bookDto4 = new BookDto("Harry Potter and the Goblet of Fire", "J. K. Rowling");
        BookDto bookDto5 = new BookDto("Harry Potter and the Order of the Phoenix", "J. K. Rowling");
        BookDto bookDto6 = new BookDto("Harry Potter and the Half-Blood Prince", "J. K. Rowling");
        BookDto bookDto7 = new BookDto("Harry Potter and the Deathly Hallows", "J. K. Rowling");
        //when
        bookService.addBook(bookDto1);
        bookService.addBook(bookDto2);
        bookService.addBook(bookDto3);
        bookService.addBook(bookDto4);
        bookService.addBook(bookDto5);
        bookService.addBook(bookDto6);
        bookService.addBook(bookDto7);
        //then
        assertEquals(7, bookService.getBooks().size());

    }



}