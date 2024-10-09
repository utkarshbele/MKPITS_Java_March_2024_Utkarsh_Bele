package library;

public class Library_Member {
    private String name, number, address,email,borrower_id, borrowed_book;
    public Library_Member()
    {
        name="Utkarsh";
        number="8795651516";
        borrower_id="8944551";
    }
    public String getName()
    {
        return name;
    }
    //....
    public String setName(String name)
    {
        this.name=name;
    }
    //.....
    public String borrowed_Book(){}
}
