package javafundamental;

import java.sql.SQLOutput;
import java.util.Scanner;

/*1. Create a Book class with following properties
        Name
        ISBN
        Pages
        Author
2. Add default and parameterized constructor
        3. Create Application class  with main method
4. Create few objects of Book in Application class
5. Print state of Book objects
        6. Add numberOfBooks static parameter to Book class.
        7. maintain book count in numberOfBooks
        8. Print number of books created so far in application class
*/
public class Book {
    public static int bookcount;
    public int isbn;
    public int pages;
    public String author;
    public String bookName;


    public Book() {
        bookcount = bookcount + 1;
    }

    public Book(String name, int isbn, int page, String author) {
        this.bookName = name;
        this.isbn = isbn;
        this.pages = page;
        this.author = author;
        bookcount = bookcount + 1;
    }

    // public Book(Book b)
    {
    }

    public void book() {

        System.out.println("The name of the book " + bookName);
        System.out.println("The number of pages are" + isbn);
        System.out.println("The name of the book " + author);
    }

}


