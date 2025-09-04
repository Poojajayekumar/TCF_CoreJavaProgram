package com.tcf.introjava;

import java.util.Scanner;  // ✅ Import Scanner

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if ((num & 1) == 0) {  // Bitwise check
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        sc.close(); // ✅ Best practice
    }
}

