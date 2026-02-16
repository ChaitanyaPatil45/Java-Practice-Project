class Book {
    int id;
    String title;
    boolean isIssued;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }

}
class User {
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Library {

    Book[] books = new Book[10];
    int count = 0;

    void addBook(Book book) {
        books[count] = book;
        count++;
    }

    void issueBook(int bookId) {
        for (int i = 0; i < count; i++) {
            if (books[i].id == bookId) {
                if (!books[i].isIssued) {
                    books[i].isIssued = true;
                    System.out.println("Book Issued Successfully");
                } else {
                    System.out.println("Book Already Issued");
                }
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    void returnBook(int bookId) {
        for (int i = 0; i < count; i++) {
            if (books[i].id == bookId) {
                if (books[i].isIssued) {
                    books[i].isIssued = false;
                    System.out.println("Book Returned Successfully");
                } else {
                    System.out.println("Book Was Not Issued");
                }
                return;
            }
        }
        System.out.println("Book Not Found");
    }
}
public class Task3 {
    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book(1, "Java");
        Book b2 = new Book(2, "Python");

        User u1 = new User(101, "Chaitanya");

        library.addBook(b1);
        library.addBook(b2);

        library.issueBook(1);
        library.returnBook(1);
    }
}
