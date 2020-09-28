package com.caniksea.adp3.practical.booklib.authormodule.repository.library.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.factory.library.BookFactory;
import com.caniksea.adp3.practical.booklib.authormodule.repository.library.BookRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;


import static org.junit.Assert.*;

/**
 * Instructions:
 *  > Make sure you have completed the task(s) in BookRepositoryImpl.java before attempting tasks below.
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
public class BookRepositoryImplTest {

    private static BookRepository repository = BookRepositoryImpl.getRepository();

    private static Book book = BookFactory.buildBook("My Book", 2020);


    @Test
    public void a_create() {
        Book createdBook = repository.create(book);
        Assert.assertEquals(book.getId(), createdBook.getId());
        System.out.println("Created:" + createdBook);
    }

    @Test
    public void b_update() {
        Book updatedBook = new Book
                .Builder()
                .copy(book)
                .setYear(2025)
                .build();

        repository.update(updatedBook);
        assertNotEquals(book.getYear(), updatedBook.getYear());
        System.out.println("Updated: " + updatedBook);
    }

    @Test
    public void c_read() {
        Book readBook = repository.read(book.getId());
        assertEquals(book.getId(), readBook.getId());
        System.out.println("Read:" + readBook);
    }

    @Test
    public void d_getAll(){
        Set<Book> books = repository.getAll();
        assertEquals(1, books.size());

        System.out.println("Get All: " + books);
    }

    @Test
    public void e_delete() {
        String bookToDel = book.getId();
        repository.delete(bookToDel);
        Set<Book> books = repository.getAll();
        assertEquals(0, books.size());

        System.out.println("Deleted: " + bookToDel);

    }
}