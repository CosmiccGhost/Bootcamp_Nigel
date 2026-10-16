package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("- Welcome to your Financial Calculator -");
        System.out.println("Before I start, I'd like to gather some Information from you");

        System.out.println("What's your loan principle");

        double P = scanner.nextDouble();

        System.out.println("Thanks, Now..");

        System.out.println("What's your annual rate");

        float r = scanner.nextFloat();

        System.out.println("Thanks, Now..");

        System.out.println("How long is your term");

        int t = scanner.nextInt();

        System.out.println("Thanks, Now we can get started!");



        }
    }
