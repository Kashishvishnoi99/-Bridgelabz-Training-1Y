public class LibraryMain {
    public static void main(String[] args) {

        Book b1 = new TextBook(1, "Java", 500);
        Book b2 = new Magazine(2, "Tech", 200);

        System.out.println(Book.libraryName);
        System.out.println(b1.calculateFine(3));
        System.out.println(b2.calculateFine(3));
    }
}
