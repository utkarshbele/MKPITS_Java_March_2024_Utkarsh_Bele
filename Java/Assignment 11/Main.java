import assign11.*;
import emp.*;
import emp.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        
		//First Program
        Contractor con= new Contractor();
        System.out.println("The total salary in dollars is "+con.calculateSalary(45,5)+"$");
        FullTimeEmployee ft= new FullTimeEmployee();
        System.out.println("The total salary for a full time emp for 8hours is "+ft.calculateSalary(8,30)+"$");

		//Second Program 
        TwoWheeler tw= new TwoWheeler("Jaguar");
        tw.displayName();
        System.out.println("Speed of motorbike is "+tw.speed()+"kmph");
        System.out.println("The number of meter cycled is "+tw.distance());

		//Third program
        try{
            StringMisMatch smm= new StringMisMatch();
            smm.compareString("madam","madjjikam");
        }catch (StringMisMatchException e) {
            System.out.println(e.getMessage());
        }

		//Fourth Program
        NumberFormat nf= new NumberFormat();
        nf.numberFormatStringIndex("abc");
        StringIndexOutOfBound si=new StringIndexOutOfBound();
        si.stringIndexOutOfBound("Hello",6);

    }
}
