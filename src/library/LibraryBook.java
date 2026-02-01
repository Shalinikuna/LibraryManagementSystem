package library;

public class LibraryBook extends BookItem {

    private boolean isAvailable;
    private String issuedTo;
    private String description;

    
    public LibraryBook(String title, int bookId, String author) {
        super(title, bookId, author);
        this.isAvailable = true;
        this.issuedTo = "None";
        this.description = "No description provided";
    }

    public LibraryBook(String title, int bookId, String author, String description) {
        super(title, bookId, author);
        this.isAvailable = true;
        this.issuedTo = "None";
        this.description = description;
    }

    
    public boolean isAvailable() {
        return isAvailable;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    
    @Override
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Book ID: " + bookId);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
        System.out.println("Issued To: " + issuedTo);
        System.out.println("Description: " + description);
        System.out.println("---------------------------");
    }

    
    public void issueBook(String studentName) {
        if (isAvailable) {
            isAvailable = false;
            issuedTo = studentName;
            System.out.println("Book issued to " + studentName);
        } else {
            System.out.println("Book already issued");
        }
    }

   
    public void issueBook(String studentName, int issueDays) {
        issueBook(studentName);
        if (issueDays > MAX_ISSUE_DAYS) {
            System.out.println("Warning: Issue days exceed MAX_ISSUE_DAYS");
        }
    }

    
    public void returnBook() {
        isAvailable = true;
        issuedTo = "None";
        System.out.println("Book returned successfully");
    }
}
