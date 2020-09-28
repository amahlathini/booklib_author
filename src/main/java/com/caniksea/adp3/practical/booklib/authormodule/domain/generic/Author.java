package com.caniksea.adp3.practical.booklib.authormodule.domain.generic;

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
public class Author {

    private String id, firstName, lastName; // DO NOT MODIFY THIS LINE.

    //default constructor
    private Author(){}

    public Author(Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{

        private String id, firstName, lastName;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        //Builder copy method for creating instance of Author
        // and making a copy of it
        public Builder copy(Author author){
            this.firstName = author.firstName;
            this.id = author.id;
            this.lastName = author.lastName;
            return this;

        }
        //creating an instance of this class
        public Author build() {
            return new Author(this);
        }
    }
}
