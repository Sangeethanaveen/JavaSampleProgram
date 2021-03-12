package javafundamental;

import java.util.Scanner;

public class switchExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("one!");
                break;
            case 2:
                System.out.println("Two!");
                break;
            case 3:
                System.out.println("Three!");
                break;
            default:
                System.out.println("Something other than this!");
        }
    }
}
