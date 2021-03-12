package javafundamental;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        int myNumber1,myNumber2,myNumber3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        myNumber1 = input.nextInt();
        myNumber2 = input.nextInt();
        myNumber3 = input.nextInt();
        if (myNumber1==myNumber2)
            System.out.println("number 1 & 2 are equal");
        else if(myNumber1==myNumber3)
            System.out.println("number 1 & 2 are equal");
        else if (myNumber2==myNumber3)
            System.out.println("Number 2 & 3 are equal");
        else
            System.out.println("Different numbers");
        if(myNumber1>myNumber2)
        {
            if (myNumber1 > myNumber3)
            {
                System.out.println("the is the greater number1: "  + myNumber1);
            }
            else
                System.out.println("the greater number3: "+myNumber3);
        }
        if (myNumber2>myNumber3)
        {

            System.out.println("the is the greater number2: "+myNumber2);

        }
        else
            System.out.println("the is the greater number3: "+myNumber3);
        }
    }

