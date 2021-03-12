package javafundamental;

import java.util.Scanner;

/** Get the no of hour , salary per hour
 *multiply the value
 * print the value
 **/
public class EmployeeGrossSalary {
    public static void main(String[] args) {
        float noofhours,noofdays;
        float netsalary,payperday;
        float bonus;
        double grosssalary;
        float hra;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of hours worked");
        noofhours = input.nextFloat();
        System.out.println("Enter the no of days worked");
        noofdays = input.nextFloat();
        System.out.println("Enter the no of payperday");
        payperday = input.nextFloat();
        netsalary = noofdays*noofhours*payperday;
        System.out.println("The net salary is"+netsalary);
        bonus = (float) (netsalary * 0.5);
        hra = (float) (netsalary*0.3);
        grosssalary = netsalary+bonus+hra;
        System.out.println("The gross salary is:"+grosssalary);



    }
}
