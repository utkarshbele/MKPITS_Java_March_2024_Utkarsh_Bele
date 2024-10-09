package library;

public class Book_Info {
    private String book_id,book_name,author_name, publication_name, edition,copies,
            check_out, check_in;

    public Book_Info()
    {
        //value assign

    }
    public Book_Info(String book_id,String book_name,String author_name, String publication_name, String edition)
    {
        this.book_id =book_id;
    }

    public String getBook_id(){
        return book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public String setBook_name(String book_name){
        this.author_name= book_name;
        return book_name;
    }
    //....
    public void editBook(){}

}
