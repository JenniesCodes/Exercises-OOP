package se.lexicon.jennie;

public class Book {

    private Author author;
    private String title;

    public Book(Author author, String title) {
        this.author = author;
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}