package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("book0", 10);
        Book book1 = new Book("book1", 20);
        Book book2 = new Book("book2", 30);
        Book book3 = new Book("Clean code", 40);

        Book[] books = new Book[4];
        books[0] = book0;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }

        books[0] = book3;
        books[3] = book0;
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getCount());
        }

        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}
