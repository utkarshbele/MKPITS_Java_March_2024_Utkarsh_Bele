package assignment_12;

public class Rental {
    public static void main(String[] args) {
        Rentable cars=new Rentable() {
            @Override
            public double calculateRent(int days) {
                return days*1000;
            }

            @Override
            public void displayDetails() {
                System.out.println("Car name :Swift");
                System.out.println("Brand: Maruti Suzuki");
                System.out.println("Plate number: MH14 789C");
                System.out.println();
            }
        };

        Rentable bikes=new Rentable() {
            @Override
            public double calculateRent(int days) {
                return days*700;
            }

            @Override
            public void displayDetails() {
                System.out.println("Bike name :Ninja-10R");
                System.out.println("Brand: Kawasaki");
                System.out.println("Plate number: MH01 214D");
                System.out.println();
            }
        };

        Rentable truck=new Rentable() {
            @Override
            public double calculateRent(int days) {
                return days*3000;
            }

            @Override
            public void displayDetails() {
                System.out.println("Car name :Prime");
                System.out.println("Brand: Volvo");
                System.out.println("Plate number: MH14 800AA");
            }
        };
        System.out.println("Th rent is "+cars.calculateRent(5));
        cars.displayDetails();
        System.out.println("Th rent is "+bikes.calculateRent(10));
        bikes.displayDetails();
        System.out.println("Th rent is "+truck.calculateRent(45));
        truck.displayDetails();
    }
}
