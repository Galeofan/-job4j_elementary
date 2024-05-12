package ru.job4j.pojo;

public class Book {
    private String name;
    private int count;

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public Book() { }

    public Book(String bookName, int pageCount) {
        this.name = bookName;
        this.count = pageCount;
    }
}
