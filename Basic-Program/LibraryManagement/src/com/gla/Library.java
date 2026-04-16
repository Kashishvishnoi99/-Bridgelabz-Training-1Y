package com.gla;

public class Library {
    private LibraryService service;

    public Library(LibraryService service) {
        this.service = service;
    }

    public LibraryService getService() {
        return service;
    }
}
