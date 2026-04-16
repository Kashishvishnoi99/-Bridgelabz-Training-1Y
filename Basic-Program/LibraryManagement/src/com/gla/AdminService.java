package com.gla;

public class AdminService {
    private LibraryService service;

    public AdminService(LibraryService service) {
        this.service = service;
    }

    public void addBook(int id, String title, String author) {
        service.addBook(new Book(id, title, author));
    }
}
