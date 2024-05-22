package Assinment14.ArrayList.LBM;
public class Main {
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
