package com.caniksea.adp3.practical.booklib.authormodule.domain.library;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;

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
public class Book {

    private String id, title; // DO NOT MODIFY THIS LINE.
    private int year; // DO NOT MODIFY THIS LINE

    //default constructor
    private Book(){}

    public Book(Builder builder){
        this.id = builder.id;
        this.title = builder.title;
        this.year = builder.year;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }


    public static class Builder {

        private String id, title;
        private int year;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        //Builder copy method for creating instance of Author
        // and making a copy of it
        public Builder copy(Book book) {
            this.title = book.title;
            this.id = book.id;
            this.year = book.year;
            return this;

        }

        //creating an instance of this class
        public Book build() {
            return new Book(this);
        }
    }
}
