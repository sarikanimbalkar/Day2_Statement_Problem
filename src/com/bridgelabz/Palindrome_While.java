package com.bridgelabz;

import java.util.Scanner;

public class Palindrome_While {
    static void Palindrome_While() {
        int reverse=0,palinNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        palinNum=num;
        while (num != 0) {
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if(palinNum == reverse)
        System.out.println("The Number is Paildrome ");
        else
            System.out.println("The Number is not Paildrome ");
    }

    public static void main(String[] args) {
        Palindrome_While();
    }
}
