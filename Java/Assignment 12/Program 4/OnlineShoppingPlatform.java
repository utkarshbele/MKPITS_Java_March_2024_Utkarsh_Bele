package assignment_12;

public class OnlineShoppingPlatform {
    public static void main(String[] args) {
        Product electronics=new Product() {
            @Override
            public double calculatePrice(float mrp) {
                return mrp;
            }

            @Override
            public void displayDetails() {
                System.out.println("Name: Trimmer");
                System.out.println("Category: Electronics");
                System.out.println("Brand: Philips");
                System.out.println("Sub category: Personal Grooming");
                System.out.println();
            }
        };

        Product clothing=new Product() {
            @Override
            public double calculatePrice(float mrp) {
                return mrp;
            }

            @Override
            public void displayDetails() {
                System.out.println("Name: Lulu lemon Tee");
                System.out.println("Category: Clothing");
                System.out.println("Brand: Lulu Lemon");
                System.out.println("Sub category: T-shirt");
                System.out.println();
            }
        };

        Product books=new Product() {
            @Override
            public double calculatePrice(float mrp) {
                return mrp;
            }

            @Override
            public void displayDetails() {
                System.out.println("Name: Song of Ice and Fire");
                System.out.println("Category: Book");
                System.out.println("Author: RR Martin");
                System.out.println("Sub category: Fiction");
                System.out.println();
            }
        };
        System.out.println("The price is "+electronics.calculatePrice(2500));
        electronics.displayDetails();
        System.out.println("The price is "+clothing.calculatePrice(5000));
        clothing.displayDetails();
        System.out.println("The price is "+books.calculatePrice(700));
        books.displayDetails();
    }
}
