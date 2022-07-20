package oop;

import oop.classes.Author;
import oop.classes.Book;

public class TestBook {

    public static void main(String[] args) {

        Book aBook = new Book(
                "Java for dummy",
                new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm'),
                19.95,
                1000
        );
        System.out.println("Name of Author - " + aBook.getAuthor().getName());
        System.out.println("Email of Author - " + aBook.getAuthor().getEmail());
    }
}
