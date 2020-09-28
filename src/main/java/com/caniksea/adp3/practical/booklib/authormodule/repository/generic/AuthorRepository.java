package com.caniksea.adp3.practical.booklib.authormodule.repository.generic;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.repository.IRepository;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *
 * Tasks:
 *  > Declare a getall method suitable for your choice of data structure. (0.25 marks)
 */
public interface AuthorRepository extends IRepository<Author, String> {
    Set<Author> getAll();
}
