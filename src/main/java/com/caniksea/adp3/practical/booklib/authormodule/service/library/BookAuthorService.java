package com.caniksea.adp3.practical.booklib.authormodule.service.library;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.BookAuthor;

import java.util.Set;

/**
 * Instructions
 *   > Your repository should be implemented based on your repository.
 *  > Note that this service interface does NOT (and should NOT) extend the IService.java.
 *
 * Tasks:
 *  > Declare a getall method suitable corresponding to your repository. (0.25 marks)
 *  > Declare a method that returns all bookauthor entities given an authorid. (0.25 marks)
 *  > Declare a method that returns all bookauthor entities given a bookid. (0.25 marks)
 *  > Declare a method to delete all bookauthor entities of a particular book (given bookid). (0.25 marks)
 *
 */
public interface BookAuthorService {
    Set<BookAuthor> getAll();
    BookAuthor create(BookAuthor bookAuthor);
    BookAuthor read(String bookId, String authorId);
    void delete(String bookId, String authorId);
}
