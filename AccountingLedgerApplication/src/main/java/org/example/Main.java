package org.example;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my Accounting Ledger Application\n ");

        System.out.println("Choose from the list bellow to get started \n");


        while(true){
            System.out.println("D) Add Deposit");
            System.out.println("P) Make Payment(Debit)");
            System.out.println("L) Ledger");
            System.out.println("X) Exit");
String answer = scanner.nextLine().trim().toUpperCase();

switch(answer){

    case "D":


        System.out.println("You chose Add Deposit");

        break;


    case "P":
        System.out.println("You chose Make Payment");
        break;



        case "L":
            System.out.println("You chose Ledger\n");
            System.out.println("Chose one of the options bellow\n");



            System.out.println("A) Display all entries \n ");

            System.out.println("D) Display only the entries that are deposits into the account \n ");

            System.out.println("P) Display only the negative entries (or payments) \n ");

            System.out.println("R) Display only the negative entries (or payments) \n ");

            answer = scanner.nextLine().trim().toUpperCase();
        break;

    case "X":


        System.out.println("You chose to Exit");
        System.exit( 0);
        break;

    default:
        System.out.println("Invalid Choice");








           }
        }
    }
}