package com.gla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryRepository repo = new LibraryRepository();
        LibraryService service = new LibraryService(repo);
        AdminService adminService = new AdminService(service);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book\n2. Show Books\n3. Issue Book\n4. Return Book\n5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    adminService.addBook(id, title, author);
                    break;

                case 2:
                    service.showBooks();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    service.issueBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    service.returnBook(sc.nextInt());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
