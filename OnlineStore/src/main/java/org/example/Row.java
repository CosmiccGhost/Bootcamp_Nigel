package org.example;

public class Row {

        public static void main(String[] args) {
            String row = "AV1051|JBL Bluetooth Speaker|89.95|Audio Video";

            String[] brokenUpRow = row.split("\\|");

            System.out.println(brokenUpRow[2]);
        }
    }

