package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
public static List<ItemList> readItemList(){
    List<ItemList> itemLists = new ArrayList<>();



    try{
        FileReader fileReader = new FileReader("src/main/resources/products.csv");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String row;

    }

    catch (IOException ex){
        System.out.println("Couldn't Read file. Check file and Try again");
    } catch (Exception e) {

        System.out.println("Could not read data from the file. check the format");

    }
    return itemLists;
}

}
