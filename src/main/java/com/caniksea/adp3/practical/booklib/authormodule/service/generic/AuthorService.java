package com.caniksea.adp3.practical.booklib.authormodule.service.generic;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.service.IService;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *
 * Tasks:
 *  > Declare a getall method suitable corresponding to your repository. (0.25 marks)
 */
public interface AuthorService extends IService<Author, String> {
    Set<Author> getAll();
}
