package library;

public class ReferenceBook extends LibraryBook {

    public ReferenceBook(String title, int bookId, String author) {
        super(title, bookId, author);
    }

    @Override
    public void issueBook(String studentName) {
        System.out.println("Reference books cannot be issued, only viewed in the library");
    }
}
