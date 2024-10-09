import assign11.*;
import emp.*;
import emp.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Employee empdet = new Employee();
        //empdet.employeeDetails();
        //empdet.employeeDisplay();
        //empdet.greaterThan();
        //empdet.totalDigits();

/*
        int n;
        System.out.println("Enter the number of elements you want in an array");
        n = scanner.nextInt();
        int[] num=new int[20];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            num[i] = scanner.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
        int c = empdet.sumArray(num);
        System.out.println("The sum of array is " +c);
*/


        //empdet.evenOdd();
        //empdet.factorialNum();
        //empdet.fiboNum();
        //empdet.exponentNum();
/*
        System.out.println("Enter the number of terms");
        int n = scanner.nextInt();
        double result=0;
        System.out.println("The harmonic series is: ");
        for (int i = n; i > 0; i--) {
            result += (double)1 / i;
            System.out.print(result+", ");
        }


        MahaState mh=new MahaState();
        DelhiState dl=new DelhiState();
        GujState gj= new GujState();

        double ttax= TotalTax.Total(mh,5000);
        System.out.println("Total Tax for "+mh.toString()+" "+ttax);
        System.out.println("Total Tax for"+dl+" "+TotalTax.Total(dl,10000));
        System.out.println("Total Tax for"+gj+" "+TotalTax.Total(gj,100000));

*/

        Contractor con= new Contractor();
        System.out.println("The total salary in dollars is "+con.calculateSalary(45,5)+"$");
        FullTimeEmployee ft= new FullTimeEmployee();
        System.out.println("The total salary for a full time emp for 8hours is "+ft.calculateSalary(8,30)+"$");


        TwoWheeler tw= new TwoWheeler("Jaguar");
        tw.displayName();
        System.out.println("Speed of motorbike is "+tw.speed()+"kmph");
        System.out.println("The number of meter cycled is "+tw.distance());

        try{
            StringMisMatch smm= new StringMisMatch();
            smm.compareString("madam","madjjikam");
        }catch (StringMisMatchException e) {
            System.out.println(e.getMessage());
        }

        NumberFormat nf= new NumberFormat();
        nf.numberFormatStringIndex("abc");
        StringIndexOutOfBound si=new StringIndexOutOfBound();
        si.stringIndexOutOfBound("Hello",6);

        String str = "This is a normal string!";
        System.out.println("Normal text is : " + str);
        //System.out.println(" ");
        // Encryption part
        String e_str = Employee.encryptedString(str.toLowerCase());
        System.out.println("Encrypted string is : " + e_str);
        // decryption part
        System.out.println("Decrypted string is : " + Employee.decryptString(e_str));
    }
}
