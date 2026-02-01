package library;

import java.util.ArrayList;

public class LibraryUtility {

   
    public static int countTotalBooks(ArrayList<LibraryBook> books) {
        return books.size();
    }

    public static void displaySystemMessage() {
        System.out.println("Welcome to Library Management System");
    }

    public static void main(String[] args) {

        displaySystemMessage();

        LibraryBook book1 = new LibraryBook(
                "Java Basics", 101, "James Gosling");

        LibraryBook book2 = new LibraryBook(
                "Advanced Java", 102, "Oracle", "Deep Java concepts");

        ReferenceBook refBook = new ReferenceBook(
                "Java Reference", 201, "Sun Microsystems");

        ArrayList<LibraryBook> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        System.out.println("Total books: " + countTotalBooks(books));
        System.out.println();

        book1.displayBookDetails();
        book1.issueBook("Shalini", 10);
        book1.displayBookDetails();
        book1.returnBook();

        System.out.println();

        refBook.issueBook("Rahul"); 
    }
}
