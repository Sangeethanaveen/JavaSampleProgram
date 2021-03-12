package javafundamental;

import java.util.Scanner;

public class CmToInch {
    /** Take i/p from user in cm multiply cm to inch converter with user input display result**/
    public static void main(String[] args) {
        double inch, cm;
        double cmToinch=0.394;
        System.out.println("Enter the value in cm");
        Scanner input = new Scanner(System.in);
        cm = input.nextFloat();
        inch = cm*cmToinch;
        System.out.println("The value in inch : 1"+inch);


    }
}
