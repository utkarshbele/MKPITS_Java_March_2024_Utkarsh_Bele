package Assinment14.ArrayList.LBM;
class Book {
    private String ISBN;
    private String title;
    private String author;
    private int yearPublished;

    public Book(String ISBN, String title, String author, int yearPublished) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    // Getters and setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished;
    }
}