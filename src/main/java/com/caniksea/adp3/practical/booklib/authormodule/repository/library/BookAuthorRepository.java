package com.caniksea.adp3.practical.booklib.authormodule.repository.library;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.domain.library.BookAuthor;

import java.util.HashMap;
import java.util.Set;

/**
 * Instructions
 *  > Your repository should be implemented using any Java data structure of your choosing.
 *  > Note that this repository interface does NOT (and should NOT) extend the IRepository.java.
 *
 * Tasks:
 *  > Declare a getall method suitable for your choice of data structure. (0.25 marks)
 *  > Declare a method that returns all bookauthor entities given an authorid. (0.25 marks)
 *  > Declare a method that returns all bookauthor entities given a bookid. (0.25 marks)
 *  > Declare a method to delete all bookauthor entities of a particular book (given bookid). (0.25 marks)
 *
 */
public interface BookAuthorRepository {
    Set<BookAuthor> getAll();
    BookAuthor create(BookAuthor bookAuthor);
    BookAuthor read(String bookId, String authorId);
    void delete(String bookId, String authorId);
}
