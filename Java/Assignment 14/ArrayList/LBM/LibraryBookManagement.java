package Assinment14.ArrayList.LBM;
import java.util.ArrayList;
public class LibraryBookManagement{
    private ArrayList<Book> library = new ArrayList<>();

    // Add a new book to the library
    public void addBook(Book book) {
        library.add(book);
    }

    // Remove a book by ISBN
    public void removeBook(String ISBN) {
        for (Book book : library) {
            if (book.getISBN().equals(ISBN)) {
                library.remove(book);
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }

    // Search for a book by ISBN and display its details
    public void searchByISBN(String ISBN) {
        for (Book book : library) {
            if (book.getISBN().equals(ISBN)) {
                System.out.println("Book details with specific ISBN "+ISBN+" is:");
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }
    //Normal display of all books
    public  void displayBooks()
    {
        System.out.println("All books in the library are:");
        for(Book book: library)
        {
            System.out.println(book);
        }
        System.out.println();
    }
    // Display all books published after a specified year
    public void displayBooksPublishedAfterYear(int year) {
        System.out.println("Books published after " + year + ":");
        for (Book book : library) {
            if (book.getYearPublished() > year) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        LibraryBookManagement librarySystem = new LibraryBookManagement();

        // Adding books to the library
        librarySystem.addBook(new Book("849165565", "The Great Gatsby", "F. Scott Fitzgerald", 1925));
        librarySystem.addBook(new Book("26565656", "To Kill a Mockingbird", "Harper Lee", 1960));
        librarySystem.addBook(new Book("8156651565", "1984", "George Orwell", 1949));

        // Displaying all books
        librarySystem.displayBooks();

        // Removing a book by ISBN
        librarySystem.removeBook("8156651565");

        // Searching for a book by ISBN
        librarySystem.searchByISBN("849165565");

        // Displaying books published after a specified year
        librarySystem.displayBooksPublishedAfterYear(1920);
    }
}