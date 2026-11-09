package org.example;

import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;


public class FileManager {
    public static List<Transaction> readTransactions() {
        List<Transaction> transactionList = new ArrayList<>();

        //reads the transactions stored in CSV file
        try {
            FileReader fileReader = new FileReader("src/main/resources/transactions.csv");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            line = bufferedReader.readLine();
            while (line != null) {
                String[] parts = line.split("\\|");

                String date = parts[0].trim();

                String time = parts[1].trim();

                String description = parts[2].trim();

                String vendor = parts[3].trim();

                double amount = Double.parseDouble(parts[4].trim());

                Transaction transaction = new Transaction(date, time, description, vendor, amount);

                transactionList.add(transaction);

                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //sorts transactions by date and time
        //new -> old
        Collections.sort(transactionList, Comparator.comparing(Transaction::getDate).thenComparing(Transaction::getTime).reversed());

        return transactionList;


    }
//checks if the CSV file ends with a newline so a new transaction can be added
    //Stops overlapping
    public static void saveTransaction(Transaction transaction) throws IOException {
File file = new File("src/main/resources/transactions.csv");

if(file.length() > 0 ){
    try {
        RandomAccessFile raf = new RandomAccessFile(file, "r");
        raf.seek(file.length() -1);
        int lastByte = raf.readByte();
        raf.close();

        if (lastByte != '\n' && lastByte != '\r'){

        }
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
}

        //Saves new transactions to csv file
        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/transactions.csv", true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(
                    transaction.getDate() + " | " +
                            transaction.getTime() + " | " +
                            transaction.getDescription() + " | " +
                            transaction.getVendor() + " | " +
                            transaction.getAmount());

            bufferedWriter.newLine();

            bufferedWriter.close();

        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}