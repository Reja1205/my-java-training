package com.metroplus.health;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first  number");
        int number1=input.nextInt();
        System.out.println("Enter second number");
        int number2=input.nextInt();

        System.out.println("sum is "+(number1+number2));


    }
}
