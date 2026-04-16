package com.gla;

public class LibraryService {
    private LibraryRepository repo;

    public LibraryService(LibraryRepository repo) {
        this.repo = repo;
    }

    public void addBook(Book book) {
        repo.addBook(book);
        System.out.println("Book added.");
    }

    public void showBooks() {
        for (Book b : repo.getAllBooks()) {
            b.display();
        }
    }

    public void issueBook(int id) {
        Book b = repo.findBookById(id);
        if (b == null) {
            System.out.println("Book not found");
        } else if (!b.isIssued()) {
            b.issue();
            System.out.println("Book issued");
        } else {
            System.out.println("Already issued");
        }
    }

    public void returnBook(int id) {
        Book b = repo.findBookById(id);
        if (b == null) {
            System.out.println("Book not found");
        } else if (b.isIssued()) {
            b.returned();
            System.out.println("Book returned");
        } else {
            System.out.println("Not issued");
        }
    }
}
