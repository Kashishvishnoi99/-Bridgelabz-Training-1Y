public class Magazine extends Book {

    public Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    public double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}