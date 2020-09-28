package com.caniksea.adp3.practical.booklib.authormodule.factory.library;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Instructions:
 *  > Make sure you have completed the task on BookFactory.java.
 *  > Use JUNIT testing framework ONLY.
 *  > Use appropriate assert method(s).
 *
 */
public class BookFactoryTest {

    /**
     * Tasks:
     *  > Replace the throw exception with your implementation of a test case for buildBook. (2 marks)
     */
    @Test
    public void buildBook() {
        Book book = new BookFactory().buildBook("How I Became A Billionare at 30", 2025);

        System.out.println("Title: " +book.getTitle());
        System.out.println("Year: "+book.getYear());
        assertEquals(2025, book.getYear());
    }
}