package org.example;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FileManager.readTransactions();

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



            System.out.println("A) All \n ");

            System.out.println("D) Deposits  \n ");

            System.out.println("P) Payments) \n ");

            System.out.println("R) Reports) \n ");

            answer = scanner.nextLine().trim().toUpperCase();

            if(answer.equalsIgnoreCase("A")){
                System.out.println("1");

            } if ( (answer.equalsIgnoreCase("D")))  System.out.println("2"); {


            } if (answer.equalsIgnoreCase("P")){
                System.out.println("3");

            }
            if(answer.equalsIgnoreCase("R")){

                System.out.println("1) Month To Date\n");
                System.out.println("2) Previous Month\n");
                System.out.println("3) Year To Date\n");
                System.out.println("4) Previous Year\n");
                System.out.println("5) Search by Vendor\n ");
                System.out.println("0) Return to Ledger Page\n");
                System.out.println("H) Home Page\n");


                answer = scanner.nextLine().toUpperCase().trim();

                if(answer.equalsIgnoreCase("1")){
                    System.out.println("");


                }
                if(answer.equalsIgnoreCase("2")){
                    System.out.println("");


                }
                if(answer.equalsIgnoreCase("3")){
                    System.out.println("");


                }
                if(answer.equalsIgnoreCase("4")){
                    System.out.println("");

                }
                if(answer.equalsIgnoreCase("5")){
                    System.out.println("");

                }
                if(answer.equalsIgnoreCase("0")){
                    System.out.println("");


                }
                if(answer.equalsIgnoreCase("H")){
                    System.out.println("");

                    
                }
            }
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