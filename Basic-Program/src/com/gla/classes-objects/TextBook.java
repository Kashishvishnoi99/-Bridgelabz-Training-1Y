public class TextBook extends Book {

    public TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    public double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}