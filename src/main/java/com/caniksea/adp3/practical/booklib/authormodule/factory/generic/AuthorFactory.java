package com.caniksea.adp3.practical.booklib.authormodule.factory.generic;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.helper;

public class AuthorFactory {

    /**
     * Instructions:
     *  > Do NOT modify the method signature.
     *  > firstName & lastName parameters must not be empty, null or "null".
     *
     * Tasks:
     *  > Replace the throw exception (line 20) with your attempt of the factory method. (3 mark)
     *
     * @param firstName
     * @param lastName
     * @return
     */
    public static Author buildAuthor(String firstName, String lastName) { // DO NOT MODIFY THIS LINE

        String authorId = helper.generateId();

        Author author = new Author.Builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setId(authorId)
                .build();
        return author;
    }
}
