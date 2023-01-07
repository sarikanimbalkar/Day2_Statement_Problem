package com.bridgelabz;

import java.util.Scanner;

public class ReverseNum_while {
    static void ReverseNum_while() {
        int reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        while (num != 0) {
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println("The Reverse Number is " + reverse);
    }

    public static void main(String[] args) {
        ReverseNum_while();
    }
}
