public class Book {
    int bookId;
    String title;
    double price;
    static String libraryName = "Smart Library";

    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public double calculateFine(int daysLate) {
        return 0;
    }
}