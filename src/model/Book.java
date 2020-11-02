package model;

public class Book extends Publication{
    public static final String TYPE = "Książka";
    public String toCsv(){
        return TYPE + ";" + getTitle() + ";" + getPublisher() + ";" + getYear() + ";" + author + ";" +
                pages + ";" + isbn + "";
    }
    private static String author;
    private static int pages;
    private static String isbn;


    public Book(String title, String author, int year, int pages, String publisher,
                String isbn){
        super(title, publisher, year);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }


    public static String getAuthor() {
        return author;
    }

    public static void setAuthor(String author) {
        Book.author = author;
    }

    public static int getPages() {
        return pages;
    }

    public static void setPages(int pages) {
        Book.pages = pages;
    }

    public static String getIsbn() {
        return isbn;
    }

    public static void setIsbn(String isbn) {
        Book.isbn = isbn;
    }

    public String toString(){
        return author + "; " + pages + "; " + isbn;
    }

    @Override
    public int compareTo(Publication o) {
        return 0;
    }
}
