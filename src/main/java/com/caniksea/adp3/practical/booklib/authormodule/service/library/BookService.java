package com.caniksea.adp3.practical.booklib.authormodule.service.library;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.service.IService;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *
 * Tasks:
 *  > Declare a getall method suitable corresponding to your repository. (0.25 marks)
 */
public interface BookService extends IService<Book, String> {
    Set<Book> getAll();
}
