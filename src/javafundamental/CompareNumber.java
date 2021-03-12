package javafundamental;

/* get a value compare with a 70 print if its greater or lesser than 70*/
import java.util.Scanner;

public class CompareNumber {
    public static void main(String[] args) {
        int myNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        myNumber = input.nextInt();
        if(myNumber>70){
            System.out.println("My number is greater then 70");
        }
        else
        System.out.println("My number is less then 70");
    }
}
