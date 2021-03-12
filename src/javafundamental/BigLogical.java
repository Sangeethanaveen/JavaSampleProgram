package javafundamental;

import java.util.Scanner;

public class BigLogical {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        num1= input.nextInt();
        num2= input.nextInt();
        num3= input.nextInt();
        if ((num1==num2)||(num1==num3)||(num2==num3))
        {
            System.out.println("some numbers are equal");
        }
        if((num1>num2)&&(num1>num3))
        {
            System.out.println("Number1 is greater");
        }
        else if((num2>num3)&&(num2>num1))
        {
            System.out.println("Number 2 greater");
        }
        else
            System.out.println("Number 3 is greater");
    }
}
