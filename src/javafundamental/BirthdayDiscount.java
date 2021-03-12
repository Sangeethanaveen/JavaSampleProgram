package javafundamental;

import java.util.Date;
import java.util.Scanner;

import static java.time.LocalDate.now;

/* get the birthday and total orders
get birthday
 */
public class BirthdayDiscount {
    public static void main(String[] args) {
        int totalorder;
        String dob;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total order");
        totalorder = input.nextInt();
        System.out.println("enter date of birth");
        dob = input.next();
        java.util.Date date=new java.util.Date();
        System.out.println(date);
        String today = date.toString();
        String current = today.substring(4,11);
        System.out.println(current);
        if(totalorder>1000){

        }




    }
}
