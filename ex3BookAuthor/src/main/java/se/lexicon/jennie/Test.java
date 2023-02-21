package se.lexicon.jennie;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jennie");
        names.add("Mehrdad");
        names.add("Max");
        names.add("Simon");
        names.add("Marcus");


        //ex1:  using foreach: iterate on the array and print all the elements or names that start with 'M' char
        System.out.println("All names that start with M: ");

        // solution...
        for (String MNames : names) {
            if(MNames.charAt(0) == 'M') {
                System.out.println(MNames);
            }
        }


        List<Book> books = new ArrayList<>();

        Author jennie = new Author("Jennie");
        Author simon = new Author("Simon");

        Book yellow = new Book(jennie, "Yellow");
        Book blue = new Book(simon, "Blue");
        Book purple = new Book(jennie, "Purple");

        jennie.addBook(yellow);
        simon.addBook(blue);
        jennie.addBook(purple);

        books.add(yellow);
        books.add(blue);
        books.add(purple);

        //ex2:  using foreach: print all books
        System.out.println("\nAll books: ");

        // solution...
        for(Book allBooks: books) {
            System.out.println(allBooks.getTitle());
        }
    }
}