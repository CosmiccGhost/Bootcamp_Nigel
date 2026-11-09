package org.example;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

//formats - Display
    public static void displayTransactions(List<Transaction> transactions) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        for (Transaction transaction : transactions) {
            System.out.println(
                    transaction.getDate() + " | " +
                            transaction.getTime() + " | " +
                            transaction.getDescription() + " | " +
                            transaction.getVendor() + " | " +
                            currencyFormatter.format(transaction.getAmount()));
        }
    }

    public static void addDeposit(Scanner scanner) {

        System.out.println("Enter deposit description:");
        String description = scanner.nextLine();

        System.out.println("Enter vendor/source:");
        String vendor = scanner.nextLine();

        System.out.println("Enter deposit amount:");
        double amount = Double.parseDouble(scanner.nextLine());

        LocalDateTime now = LocalDateTime.now();

        String date = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        Transaction transaction = new Transaction(date, time, description, vendor, amount);


        try {
            FileManager.saveTransaction(transaction);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Deposit saved successfully!");
    }

    public static void displayDeposits(List<Transaction> transactions) {

        for (Transaction transaction : transactions) {

            if (transaction.getAmount() > 0) {

                System.out.println(
                        transaction.getDate() + " | " +
                                transaction.getTime() + " | " +
                                transaction.getDescription() + " | " +
                                transaction.getVendor() + " | " +
                                NumberFormat.getCurrencyInstance(Locale.US) //
                                        .format(transaction.getAmount())
                );
            }
        }
    }

    public static void makePayment(Scanner scanner) {

        System.out.println("Enter payment description:");
        String description = scanner.nextLine();

        System.out.println("Enter vendor:");
        String vendor = scanner.nextLine();

        System.out.println("Enter payment amount:");
        double amount = Double.parseDouble(scanner.nextLine());

        amount = -Math.abs(amount);

        LocalDateTime now = LocalDateTime.now();

        String date = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        Transaction transaction = new Transaction(
                date, time, description, vendor, amount);

        try {
            FileManager.saveTransaction(transaction);

            System.out.println("Payment Saved Successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void displayPayments(List<Transaction> transactions) {

        for (Transaction transaction : transactions) {

            if (transaction.getAmount() < 0) {

                System.out.println(
                        transaction.getDate() + " | " +
                                transaction.getTime() + " | " +
                                transaction.getDescription() + " | " +
                                transaction.getVendor() + " | " +
                                NumberFormat.getCurrencyInstance(Locale.US)
                                        .format(transaction.getAmount())
                );
            }
        }
    }
//---------------------------------------------------------------------------------------------------------------------
    public static void monthToDate(List<Transaction> transactions) {

        LocalDate today = LocalDate.now();

        LocalDate firstDay = today.withDayOfMonth(1);

        List<Transaction> results = new ArrayList<>();

        for (Transaction transaction : transactions) {

            LocalDate transactionDate =
                    LocalDate.parse(transaction.getDate().trim());

            if (!transactionDate.isBefore(firstDay)
                    && !transactionDate.isAfter(today)) {

                results.add(transaction);
            }
        }

        displayTransactions(results);
    }

    public static void previousMonth(List<Transaction> transactions) {

        LocalDate today = LocalDate.now();

        LocalDate previousMonth = today.minusMonths(1);

        LocalDate firstDay = previousMonth.withDayOfMonth(1);

        LocalDate lastDay = previousMonth.withDayOfMonth(
                previousMonth.lengthOfMonth()
        );

        List<Transaction> results = new ArrayList<>();

        for (Transaction transaction : transactions) {

            LocalDate transactionDate =
                    LocalDate.parse(transaction.getDate().trim());

            if (!transactionDate.isBefore(firstDay)
                    && !transactionDate.isAfter(lastDay)) {

                results.add(transaction);
            }
        }

        displayTransactions(results);
    }

    public static void yearToDate(List<Transaction> transactions) {
        LocalDate today = LocalDate.now();
        LocalDate firstDay = today.withDayOfYear(1);

        List<Transaction> results = new ArrayList<>();

        for (Transaction transaction : transactions) {
            LocalDate transactionDate =
                    LocalDate.parse(transaction.getDate().trim());

            if (!transactionDate.isBefore(firstDay)
                    && !transactionDate.isAfter(today)) {
                results.add(transaction);
            }
        }

        displayTransactions(results);
    }

    public static void previousYear(List<Transaction> transactions) {
        LocalDate today = LocalDate.now();

        LocalDate firstDay = LocalDate.of(today.getYear() - 1, 1, 1);
        LocalDate lastDay = LocalDate.of(today.getYear() - 1, 12, 31);

        List<Transaction> results = new ArrayList<>();

        for (Transaction transaction : transactions) {
            LocalDate transactionDate =
                    LocalDate.parse(transaction.getDate().trim());

            if (!transactionDate.isBefore(firstDay)
                    && !transactionDate.isAfter(lastDay)) {
                results.add(transaction);
            }
        }

        displayTransactions(results);
    }

    public static void searchByVendor(List<Transaction> transactions, String vendor) {
        List<Transaction> results = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if (transaction.getVendor().equalsIgnoreCase(vendor.trim())) {
                results.add(transaction);
            }
        }

        displayTransactions(results);
    }

//----------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        FileManager.readTransactions();

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Welcome to my Accounting Ledger Application\n ");

        System.out.println("Choose from the list bellow to get started \n");
        System.out.println("--------------------------------------------------");

        while (true) {
            System.out.println("D) Add Deposit");
            System.out.println("P) Make Payment(Debit)");
            System.out.println("L) Ledger");
            System.out.println("X) Exit");
            String answer = scanner.nextLine().trim().toUpperCase();

            switch (answer) {

                case "D":
                    addDeposit(scanner);
                    break;

                case "P":
                    makePayment(scanner);
                    break;

                case "L": {

                    boolean goHome = false;

                    // Ledger menu loop
                    while (!goHome) {
                        System.out.println("----------------------------");
                        System.out.println("You chose Ledger\n");
                        System.out.println("Choose one of the options below");
                        System.out.println("----------------------------");


                        System.out.println("A) All");
                        System.out.println("D) Deposits");
                        System.out.println("P) Payments");
                        System.out.println("R) Reports");

                        answer = scanner.nextLine().trim().toUpperCase();

                        List<Transaction> transactions = FileManager.readTransactions();

                        if (answer.equals("A")) {
                            displayTransactions(transactions);

                        } else if (answer.equals("D")) {
                            displayDeposits(transactions);

                        } else if (answer.equals("P")) {
                            displayPayments(transactions);

                        } else if (answer.equals("R")) {

                            // Reports menu loop
                            while (true) {
                                System.out.println("----------------------------");
                                System.out.println("1) Month To Date");
                                System.out.println("2) Previous Month");
                                System.out.println("3) Year To Date");
                                System.out.println("4) Previous Year");
                                System.out.println("5) Search by Vendor");
                                System.out.println("0) Return to Ledger Page");
                                System.out.println("H) Home Page");
                                System.out.println("----------------------------");
                                answer = scanner.nextLine().trim().toUpperCase();

                                if (answer.equals("0")) {
                                    break;

                                } else if (answer.equals("H")) {
                                    goHome = true;
                                    break;

                                } else if (answer.equals("1")) {
                                    monthToDate(FileManager.readTransactions());


                                } else if (answer.equals("2")) {
                                    previousMonth(FileManager.readTransactions());


                                } else if (answer.equals("3")) {
                                    yearToDate(FileManager.readTransactions());

                                } else if (answer.equals("4")) {
                                    previousYear(FileManager.readTransactions());


                                } else if (answer.equals("5")) {
                                    System.out.print("Enter vendor name: ");
                                    String vendor = scanner.nextLine();

                                    searchByVendor(FileManager.readTransactions(), vendor);
                                } else {
                                    System.out.println("Invalid Choice");
                                }
                            }
                        } else {
                            System.out.println("Invalid Choice");
                        }
                    }

                    break;
                }
                case "X":
                    System.out.println("Exiting Program");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}