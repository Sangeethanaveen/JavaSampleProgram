package javafundamental.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of animals");
        int n=input.nextInt();
        String name;
        ArrayList<String>animal = new ArrayList<>();
        System.out.println("Enter the animals List ");
        for(int i =0;i<n;i++){   //get input
           name = input.next();
            animal.add(name);
        }
        System.out.println(animal);
    }
}