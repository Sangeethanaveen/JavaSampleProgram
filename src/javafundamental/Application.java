package javafundamental;

public class Application {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("a", 123, 123, "sangeetha");
        Book book3 = new Book("a", 124, 123, "sangeetha");
        System.out.println(Book.bookcount);
       // Book bookcc = new Book(a2);

    }
}
