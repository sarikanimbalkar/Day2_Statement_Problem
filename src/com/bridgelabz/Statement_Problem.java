package com.bridgelabz;

import java.util.Scanner;

public class Statement_Problem {
    static void checkNum() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        num = sc.nextInt();
        if (num == 1)
            System.out.println("Unit");
        else if (num == 10) {
            System.out.println("Ten");
        } else if (num == 100) {
            System.out.println("Hundred");
        } else if (num == 1000) {
            System.out.println("Thousand");
        } else
            System.out.println("Wrong input....");
    }

    public static void main(String args[]) {
        checkNum();
    }
}
