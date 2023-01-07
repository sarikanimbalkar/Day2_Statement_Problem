package com.bridgelabz;

import java.util.Scanner;

public class Sumof_While {
    static void Sumof_Num_While() {
        int sum = 0, number = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        while (number <= n) {
            sum = sum + number;
            number++;
        }
        System.out.println("Sum of " + n + "is " + sum);
    }

    public static void main(String[] args) {
        Sumof_Num_While();
    }
}
