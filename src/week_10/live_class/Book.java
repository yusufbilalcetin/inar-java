package week_10.live_class;

public class Book {
    private String name;

    private String author;

    private int page;


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    public Book(String name, String author, int page) {
        if (page > 0) {
            this.name = name;
            this.author = author;
            this.page = page;
        }


    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}
