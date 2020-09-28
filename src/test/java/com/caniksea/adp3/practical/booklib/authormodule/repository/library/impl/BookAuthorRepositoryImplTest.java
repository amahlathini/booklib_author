package com.caniksea.adp3.practical.booklib.authormodule.repository.library.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.domain.library.BookAuthor;
import com.caniksea.adp3.practical.booklib.authormodule.factory.library.BookAuthorFactory;
import com.caniksea.adp3.practical.booklib.authormodule.factory.library.BookFactory;
import com.caniksea.adp3.practical.booklib.authormodule.repository.library.BookAuthorRepository;
import com.caniksea.adp3.practical.booklib.authormodule.repository.library.BookRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * Instructions:
 *  > Make sure you have completed the task(s) in BookAuthorRepositoryImpl.java before attempting tasks below.
 *  > Use JUNIT testing framework ONLY.
 *  > Use appropriate assert method(s).
 *
 * Tasks:
 *  > Replace the throw exception with test cases the create methods. (0.25 marks)
 *  > Replace the throw exception with test cases the read methods. (0.5 marks)
 *  > Replace the throw exception with test cases the delete methods. (0.75 marks)
 *  > Write a test case for the implemented method that returns all bookauthor entities given bookid. (0.5 marks)
 *  > Write a test case for the implemented method that returns all bookauthor entities given authorid. (0.5 marks)
 *  > Write a test case for the implemented method that delete all bookauthor entites given bookid. (0.5 marks)
 *  > Write a test case for the getall method. (0.25 marks)
 *  > Ensure your tests run in a right order (Hint: method name ascending). (0.125 marks)
 *
 */
public class BookAuthorRepositoryImplTest {

    private static BookAuthorRepository repository = BookAuthorRepositoryImpl.getRepository();

    private static BookAuthor bookAuthor = BookAuthorFactory.buildBookAuthor("Book-id", "authorId");


    @Test
    public void a_create() {
        BookAuthor createdBookAuthor = repository.create(bookAuthor);
        Assert.assertEquals(bookAuthor.getAuthorId(), createdBookAuthor.getAuthorId());
        System.out.println("Created:" + createdBookAuthor);
    }


    @Test
    public void c_read() {
        BookAuthor readBookAuthor = repository.read(bookAuthor.getAuthorId(), bookAuthor.getBookId());
        assertEquals(bookAuthor.getAuthorId(), readBookAuthor.getAuthorId());
        System.out.println("Read:" + readBookAuthor);
    }

    @Test
    public void d_getAll(){
        Set<BookAuthor> bookAuthors = repository.getAll();
        assertEquals(1, bookAuthors.size());

        System.out.println("Get All: " + bookAuthors);
    }

    @Test
    public void e_delete() {
        String bookAuthorToDel = bookAuthor.getAuthorId();
        repository.delete(bookAuthorToDel);
        Set<BookAuthor> bookAuthors = repository.getAll();
        assertEquals(0, bookAuthors.size());

        System.out.println("Deleted: " + bookToDel);
}