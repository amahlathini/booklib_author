package com.caniksea.adp3.practical.booklib.authormodule.repository.library.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.BookAuthor;
import com.caniksea.adp3.practical.booklib.authormodule.repository.library.BookAuthorRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in BookAuthorRepository.java before attempting the tasks below.
 *  > Note that no Update operation is needed here.
 *
 * Tasks:
 *  > Implement repository using singleton and your chosen Java data structure. (1.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create methods. (0.25 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read methods. (0.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete methods. (0.75 marks)
 *  > Write an implementation of the getall method you declared in the interface. (0.25 marks)
 *  > Write an implementation of the method you declared in the interface that returns all
 *      bookauthor entities given bookid. (1.5 marks)
 *  > Write an implementation of the method you declared in the interface that returns all
 *      bookauthor entities given authorid. (1.5 marks)
 *  > Write an implementation of the method you declared to delete all bookauthor entites
 *      given a bookid. (1.5 marks)
 *
 */
public class BookAuthorRepositoryImpl implements BookAuthorRepository {

    private static BookAuthorRepository repository = null;
    private Set<BookAuthor> bookAuthorDB;

    private BookAuthorRepositoryImpl(){this.bookAuthorDB = new HashSet<>();
    }

    public static BookAuthorRepository getRepository(){
        if (repository == null) repository = new BookAuthorRepositoryImpl();
        return repository;
    }

    @Override
    public BookAuthor create(BookAuthor bookAuthor) {
        this.bookAuthorDB.add(bookAuthor);
        return bookAuthor;
    }

    @Override
    public BookAuthor read(String bookId, String authorId) {
        BookAuthor bookAuthor = this.bookAuthorDB
                .stream()
                .filter(a -> a
                        .getAuthorId()
                        .trim()
                        .equalsIgnoreCase(authorId)
                )
                .findAny()
                .orElse(this.bookAuthorDB
                        .stream()
                        .filter(b -> b
                                .getBookId()
                                .trim()
                                .equalsIgnoreCase(bookId))
                        .findAny()
                        .orElse(null));
        return bookAuthor;
    }

    @Override
    public void delete(String bookId, String authorId) {
        BookAuthor bookAuthor = read(bookId, authorId);
        if (bookAuthor != null){
            this.bookAuthorDB.remove(bookAuthor);
        }
    }



    @Override
    public Set<BookAuthor> getAll() {
        return this.bookAuthorDB;
    }
}
