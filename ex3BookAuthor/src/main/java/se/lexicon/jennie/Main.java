package se.lexicon.jennie;

import java.util.ArrayList;

public class Main {

    static ArrayList<Author> listOfAuthors = new ArrayList<>();

    public static void main(String[] args) {

        Author jennie = new Author("Jennie");
        Author simon = new Author("Simon");

        Book yellow = new Book(jennie, "Yellow");
        Book blue = new Book(simon, "Blue");
        Book purple = new Book(jennie, "Purple");

        jennie.addBook(yellow);
        simon.addBook(blue);
        jennie.addBook(purple);

        listOfAuthors.add(jennie);
        listOfAuthors.add(simon);

        printAllBooks(jennie);
        System.out.println("");
        printAuthor("Blue");
    }

    public static void printAllBooks(Author authorToFind) {

        System.out.println("All books by " + authorToFind.getName() + ":");

        for (Author author : listOfAuthors) {
            if (author == authorToFind) {
                for(Book book : author.getBooks()) {
                    System.out.println(book.getTitle());
                }
            }
        }
    }

    public static void printAuthor(String title) {

        System.out.println("The author of " + title + ":");

        for (Author author : listOfAuthors) {
            for (Book book : author.getBooks()) {
                if (book.getTitle().equals(title)) {
                    System.out.println(author.getName());
                }
            }
        }
    }
}