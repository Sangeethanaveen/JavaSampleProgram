package javafundamental;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] number = new int[10];
        Random random = new Random();
        for(int i=0; i<number.length;i++) {
            number[i] = random.nextInt();
        }
        for(int no:number)
            System.out.println(no);
        }
    }


