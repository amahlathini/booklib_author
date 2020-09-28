package com.caniksea.adp3.practical.booklib.authormodule.factory.library;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.BookAuthor;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Instructions:
 *  > Make sure you have completed the task on BookAuthorFactory.java.
 *  > Use JUNIT testing framework ONLY.
 *  > Use appropriate assert method(s).
 */
public class BookAuthorFactoryTest {

    /**
     * Tasks:
     *  > Replace the throw exception with your implementation of a test case for buildBookAuthor. (2 marks)
     */
    @Test
    public void buildBookAuthor() {
        BookAuthor bookAuthor = new BookAuthorFactory().buildBookAuthor("randomly-generated-Id", "randomly-generated-Id");
        System.out.println(bookAuthor.getAuthorId());
        System.out.println(bookAuthor.getBookId());
        assertEquals("randomly-generated-Id", bookAuthor.getAuthorId());
    }
}