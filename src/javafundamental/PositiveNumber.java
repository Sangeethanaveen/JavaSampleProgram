package javafundamental;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

/* Get a number check if its greater than 0 or lesser than 0*/
public class PositiveNumber {
    public static void main(String[] args) {
        int value;
        Scanner input = new Scanner((System.in));
        System.out.println("Enter a number");
        value = input.nextInt();
        if (value>0){
            System.out.println("Value is positive");
        }
        else if(value ==0)
        {
            System.out.println("Value is 0");
        }
        else
            System.out.println("Value is negative");
    }
}
