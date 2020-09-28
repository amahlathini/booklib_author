package com.caniksea.adp3.practical.booklib.authormodule.domain.library;

/**
 * Instructions:
 *  > Do NOT modify class instance variable declaration.
 *
 * Tasks:
 *  > Implement class using Builder Pattern ONLY. (2 marks)
 *
 */
/*
 * Ayabulela Mahlathini
 * Student Number:218017774*
 */
public class BookAuthor {

    private String bookId, authorId; // DO NOT MODIFY THIS LINE.

    //default constructor
    private BookAuthor(){}

    public BookAuthor(Builder builder){
        this.bookId = builder.bookId;
        this.authorId = builder.authorId;
    }

    public String getBookId() {
        return bookId;
    }

    public String getAuthorId() {
        return authorId;
    }

    @Override
    public String toString() {
        return "BookAuthor{" +
                "bookId='" + bookId + '\'' +
                ", authorId='" + authorId + '\'' +
                '}';
    }

    public static class Builder {

        private String bookId, authorId;

        public Builder setBookId(String bookId) {
            this.bookId = bookId;
            return this;
        }

        public Builder setAuthorId(String authorId) {
            this.authorId = authorId;
            return this;
        }

        //Builder copy method for creating instance of Author
        // and making a copy of it
        public Builder copy(BookAuthor bookAuthor) {
            this.bookId = bookAuthor.bookId;
            this.authorId = bookAuthor.authorId;
            return this;

        }

        //creating an instance of this class
        public BookAuthor build() {
            return new BookAuthor(this);
        }
    }
}
