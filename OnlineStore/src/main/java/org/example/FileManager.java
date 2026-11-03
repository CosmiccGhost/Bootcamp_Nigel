package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {


    private static String department;

    public static List<Item> readItem() {
        List<Item> itemLists = new ArrayList<>();


        try {
            FileReader fileReader = new FileReader("src/main/resources/item.csv");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String row;

            bufferedReader.readLine();

            while ((row = bufferedReader.readLine()) != null) {


                String[] brokenUpRow = row.split("\\|");

                int id = Integer.parseInt(brokenUpRow[0]);

                //change to an integer

                String product = brokenUpRow[1];

                float price = Float.parseFloat(brokenUpRow[2]);


                Item item = new Item(department, price, product, id);

                itemLists.add(item);
            }
        } catch (IOException ex) {
            System.out.println("Couldn't Read file. Check file and Try again");
        } catch (Exception e) {

            System.out.println("Could not read data from the file. check the format");

        }
        return itemLists;
    }

    public static List<Item> readitemList() {
        return List.of();
    }
    public static void writeItem(Item item){
        try{

            FileWriter fileWriter = new FileWriter("src/main/resources/item.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line = String.format("%s|%s|%d|%s",
                    item.getDepartment(),
                    item.getPrice(),
                    item.getProduct(),
                    item.getId());


            bufferedWriter.newLine();
            bufferedWriter.write(line);


            bufferedWriter.close();

            System.out.println("Write complete!");


        }
        catch (IOException ex){
            System.out.println("Could not write");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }


    }

