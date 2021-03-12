package javafundamental;

import java.util.Scanner;
/* get total order if above 1000 upgrade to gold or else
they are short by amt
 */

public class CustomerDiscount {
    public static void main(String[] args) {
        int totalorder;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of order");
        totalorder = input.nextInt();
        if(totalorder>1000){
            System.out.println("you are upgraded to gold");
        }
        else {
            int value = 1000 - totalorder;
            System.out.println("you are short by " + value);
        }
    }
}
