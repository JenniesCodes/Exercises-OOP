package se.lexicon.jennie;

import java.util.ArrayList;

public class Author {

    private ArrayList<Book> books;
    private String name;

    public Author(String n) {
        name = n;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }
}