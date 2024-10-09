package assignment_12;

import java.util.Date;

public class LibraryManagementSys {
    public static void main(String[] args) {
        LibraryItem books= new LibraryItem() {
            @Override
            public void checkOut() {
                System.out.println("Book Checkout successfully");
            }

            @Override
            public void returnItem() {
                System.out.println("Return of the book successful");
                System.out.println();
            }
        };

            LibraryItem dvd= new LibraryItem() {
                @Override
                public void checkOut() {
                    System.out.println("DVD checkout successfully");
                }

                @Override
                public void returnItem() {
                    System.out.println("Return of the DVD successfull");
                    System.out.println();
                }
            };

                LibraryItem journals= new LibraryItem() {
                    @Override
                    public void checkOut() {
                        System.out.println("Journal checkout successfully done");
                    }

                    @Override
                    public void returnItem() {
                        System.out.println("Return of the Journal successfull");
                    }
                };
                books.checkOut();
                books.returnItem();
                dvd.checkOut();
                dvd.returnItem();
                journals.checkOut();
                journals.returnItem();
    }
}
