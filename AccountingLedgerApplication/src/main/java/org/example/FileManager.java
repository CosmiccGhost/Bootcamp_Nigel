package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
public static List<Transaction> readTransactions() {
    List<Transaction> transactionList = new ArrayList<>();



    try{
        FileReader fileReader = new FileReader("src/main/resources/transactions.csv");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

String line = bufferedReader.readLine();

line = bufferedReader.readLine();
while (line != null){

    String[] parts = line.split("\\|");
    String date = parts[0];
    String time = parts[1];
    String description = parts[2];
    String vendor = parts[3];
    double amount = Double.parseDouble(parts[4]);

  Transaction transaction = new Transaction(date, time, description, vendor, amount);

    transactionList.add(transaction);

    line = bufferedReader.readLine();
}


    } catch (Exception e) {
        throw new RuntimeException(e);
    }


    return transactionList;
}


}
