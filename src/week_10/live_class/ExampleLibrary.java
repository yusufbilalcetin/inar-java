package week_10.live_class;

public class ExampleLibrary {
    public static void main(String[] args) {

        Book book1 = new Book("Sefiller", "Hugo", 100);
        Book book2 = new Book("Cin Ali", "Mustafa Sayar", 10);

        Computer computer1 = new Computer(16, "Asus");
        Computer computer2 = new Computer(32, "Monster");

        Librarian librarian1 = new Librarian("Yusuf Bilal", "Çetin", "10");
        Librarian librarian2 = new Librarian("Lionel", "Messi", "2");

        Computer[] computers = new Computer[2];
        Book[] books = new Book[2];
        Librarian[] librarians = new Librarian[2];

        computers[0] = computer1;
        computers[1] = computer2;

        books[0] = book1;
        books[1] = book2;

        librarians[0] = librarian1;
        librarians[1] = librarian2;

        Library library = new Library(books, computers, librarians);

        System.out.println(library);


    }

}
