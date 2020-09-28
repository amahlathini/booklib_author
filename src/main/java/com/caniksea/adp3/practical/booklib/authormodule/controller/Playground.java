package com.caniksea.adp3.practical.booklib.authormodule.controller;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.domain.library.BookAuthor;
import com.caniksea.adp3.practical.booklib.authormodule.service.generic.impl.AuthorServiceImpl;
import com.caniksea.adp3.practical.booklib.authormodule.service.library.impl.BookAuthorServiceImpl;

import java.math.BigDecimal;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Instructions:
 *  > Make sure you have completed all tasks in the service package.
 *  > Do not modify class signature.
 *
 */

public class Playground {

    /**
     * Tasks:
     *  > Replace the throw exception with an implementation that returns lastname of all authors
     *      of a given book. (6 marks)
     *
     * @param bookId
     * @return
     */

    private BookAuthorServiceImpl bookAuthorService;
    private AuthorServiceImpl authorService;
    Set<BookAuthor> getBookAuthorsLastName(String bookId) {
        /*Set<BookAuthor> bookAuthors = bookAuthorService.getAll();
        Set<BookAuthor> bookAuthorSet;

        bookAuthorSet = bookAuthors.stream()
                .filter(o -> o
                        .getBookId()
                        .trim()
                        .equalsIgnoreCase(bookId))
                .collect(Collectors.toSet());
        Set<Author> authorSet = authorService.getAll()
                Set<Author> authors;
        authors = authorSet.stream().filter(a -> a.getId().equalsIgnoreCase(bookAuthorSet.stream().filter(a -> a.getAuthorId().)))
        return bookAuthorSet;*/
        return null;

    }

    /**
     * Tasks:
     *  > Replace the throw exception with an implementation that returns the title of all books
     *      of a given author in a given year. (7 marks)
     *
     * @param authorId
     * @param year
     * @return
     */
    Set<String> getBookTitlesByAuthorforYear(String authorId, int year) {
        throw new UnsupportedOperationException();
    }
}
