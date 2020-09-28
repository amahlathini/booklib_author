package com.caniksea.adp3.practical.booklib.authormodule.repository.library.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.repository.library.BookRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in BookRepository.java before attempting the tasks below.
 *
 * Tasks:
 *  > Implement repository using singleton and your chosen Java data structure. (1.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create methods. (0.25 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read methods. (0.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the update methods. (0.75 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete methods. (0.75 marks)
 *  > Write an implementation of the getall method you declared in the interface. (0.25 marks)
 *
 */
public class BookRepositoryImpl implements BookRepository {
    private static BookRepository repository = null;
    private Set<Book> bookDB;

    private BookRepositoryImpl(){this.bookDB = new HashSet<>();
    }

    public static BookRepository getRepository(){
        if (repository == null) repository = new BookRepositoryImpl();
        return repository;
    }

    @Override
    public Book create(Book book) {
        this.bookDB.add(book);
        return book;
    }

    @Override
    public Book update(Book book) {
        delete(book.getId());
        this.bookDB.add(book);
        return book;
    }

    @Override
    public Book read(String s) {
        Book book = this.bookDB
                .stream()
                .filter(a -> a
                        .getId()
                        .trim()
                        .equalsIgnoreCase(s)
                )
                .findAny()
                .orElse(null);
        return book;
    }

    @Override
    public void delete(String s) {
        Book book = read(s);
        if (book != null){
            this.bookDB.remove(book);
        }
    }

    @Override
    public Set<Book> getAll() {
        return this.bookDB;
    }
}
