package myio;

import java.io.Serializable;

public class Library_Member implements Serializable {
    private String name, number, address,email,borrower_id, borrowed_book;
    public Library_Member()
    {
        name="Utkarsh";
        number="8795651516";
        borrower_id="8944551";
    }
    public Library_Member(String name, String number)
    {
        this.name=name;
        this.number=number;
        this.borrower_id=borrower_id;
    }
    public String getName()
    {
        System.out.println(name);
        return name;
    }
    public String getNumber()
    {
        System.out.println(number);
        return number;
    }

    //....
    public String setName(String name)
    {
        this.name=name;
        return name;
    }
    //.....
    public void borrowed_Book(){}
}
