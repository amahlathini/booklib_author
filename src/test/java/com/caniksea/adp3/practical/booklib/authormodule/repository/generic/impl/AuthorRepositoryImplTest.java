package com.caniksea.adp3.practical.booklib.authormodule.repository.generic.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.factory.generic.AuthorFactory;
import com.caniksea.adp3.practical.booklib.authormodule.repository.generic.AuthorRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * Instructions:
 *  > Make sure you have completed the task(s) in AuthorRepositoryImpl.java before attempting tasks below.
 *  > Use JUNIT testing framework ONLY.
 *  > Use appropriate assert method(s).
 *
 * Tasks:
 *  > Replace the throw exception with test cases the create methods. (0.25 marks)
 *  > Replace the throw exception with test cases the read methods. (0.5 marks)
 *  > Replace the throw exception with test cases the update methods. (0.75 marks)
 *  > Replace the throw exception with test cases the delete methods. (0.75 marks)
 *  > Write a test case for the getall method. (0.25 marks)
 *  > Ensure your tests run in a right order (Hint: method name ascending). (0.125 marks)
 *
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AuthorRepositoryImplTest {

    private static AuthorRepository repository = AuthorRepositoryImpl.getRepository();

    private static Author author = AuthorFactory.buildAuthor("Ayabulela", "Mahlathini");


    @Test
    public void a_create() {
        Author createdAuthor = repository.create(author);
        Assert.assertEquals(author.getId(), createdAuthor.getId());
        System.out.println("Created:" + createdAuthor);
    }

    @Test
    public void b_update() {
        Author updatedAuthor = new Author
                .Builder()
                .copy(author)
                .setFirstName("Yanela")
                .build();

        repository.update(updatedAuthor);
        assertNotEquals(author.getFirstName(), updatedAuthor.getFirstName());
        System.out.println("Updated: " + updatedAuthor);
    }

    @Test
    public void c_read() {
        Author readAuthor = repository.read(author.getId());
        assertEquals(author.getId(), readAuthor.getId());
        System.out.println("Read:" + readAuthor);
    }

    @Test
    public void d_getAll(){
        Set<Author> authors = repository.getAll();
        assertEquals(1, authors.size());

        System.out.println("Get All: " + authors);
    }

    @Test
    public void e_delete() {
        String authorToDel = author.getId();
        repository.delete(authorToDel);
        Set<Author> authors = repository.getAll();
        assertEquals(0, authors.size());

            System.out.println("Deleted: " + authorToDel);

    }
}