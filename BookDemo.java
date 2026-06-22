public class BookDemo {
    public static void main(String[] args) {
        Book firstBook = new Book("Кристина", "Стивен Кинг", 1983);
        Book secondBook = new Book("Мизери", "Стивен Кинг", 1987);

        firstBook.displayInfo();
        secondBook.displayInfo();

        secondBook.setYear(1988);
        System.out.println("После изменения года издания:");
        secondBook.displayInfo();
    }
}

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Книга: " + title + ", автор: " + author + ", год: " + year);
    }
}
