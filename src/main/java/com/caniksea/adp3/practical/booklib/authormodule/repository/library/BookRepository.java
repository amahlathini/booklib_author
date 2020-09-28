package com.caniksea.adp3.practical.booklib.authormodule.repository.library;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.repository.IRepository;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *
 * Tasks:
 *  > Declare a getall method suitable for your choice of data structure. (0.25 marks)
 */
public interface BookRepository extends IRepository<Book, String> {
    Set<Book> getAll();
}
