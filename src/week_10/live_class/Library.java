package week_10.live_class;

import java.util.Arrays;

public class Library {
    Book[] books = new Book[10];
    Computer[] computers = new Computer[10];

    Librarian[] librarians = new Librarian[10];

    public Library() {

    }

    public Library(Book[] books, Computer[] computers, Librarian[] librarians) {
        this.books = books;
        this.computers = computers;
        this.librarians = librarians;
    }

    public Book[] getBooks() {
        return books;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public Librarian[] getLibrarians() {
        return librarians;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public void setLibrarians(Librarian[] librarians) {
        this.librarians = librarians;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                ", computers=" + Arrays.toString(computers) +
                ", librarians=" + Arrays.toString(librarians) +
                '}';
    }
}
