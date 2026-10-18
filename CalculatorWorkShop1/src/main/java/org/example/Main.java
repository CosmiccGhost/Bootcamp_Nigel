package org.example;
import java.text.NumberFormat;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final int MONTHS = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        boolean isRunning = true;


        while (isRunning) {
            System.out.println("*****************************");
            System.out.println("Welcome to my F.F Calculator");
            System.out.println("*****************************");

            System.out.println("1. Financial Calculator");
            System.out.println("2. Future Value Calculator");
            System.out.println("3. Exit");
            System.out.println("******************************");

            System.out.println("Enter your choice");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Financial Calculator");


                    System.out.println("What is your principal");

                    double principal = scanner.nextDouble();

                    System.out.println("Whats the interest rate");

                    float annualRate = scanner.nextFloat();

                    System.out.println("How long is the term");

                    int termInYears = scanner.nextInt();

                    System.out.println("Calculating your monthly payment and total Interest");

                    float monthlyRate = annualRate / MONTHS;
                    int totalPayments = termInYears * MONTHS;

                    double monthlyPayment = principal * ((monthlyRate * (Math.pow(1 + monthlyRate, totalPayments))) /  ((Math.pow(1 + monthlyRate, totalPayments)) - 1));

                    System.out.println("Monthly Payment: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));

                    System.out.println("Total Interest: " + NumberFormat.getCurrencyInstance().format(monthlyPayment * totalPayments));
                }
                case 2 -> {
                    System.out.println("Future Value Calculator");

                    System.out.print("Starting Amount: ");
                    double principal = scanner.nextDouble();

                    System.out.print("Interest Rate : ");
                    double rate = scanner.nextDouble();

                    System.out.print("Years: ");
                    int years = scanner.nextInt();

                    double futureValue = principal * Math.pow(1 + (rate / 100), years);

                    System.out.println("Future Value: "
                            + NumberFormat.getCurrencyInstance().format(futureValue));
                }

                case 3 ->
                    isRunning = false;


                default ->
                    System.out.println("Invalid Choice");


            }
        }
    }
}

