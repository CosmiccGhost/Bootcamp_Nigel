package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
int number = 0;
boolean loop = true;
Scanner scanner = new Scanner(System.in);


        Book[] book =  new Book[20];

        book[0] = new Book(10456, "Dracula", "Horror", true, "Bram Stoker");

        book[1] = new Book(23891, "Frankenstein", "Horror", true, "Mary Shelley");

        book[2] = new Book(37542, "The Shining", "Horror", true, "Stephen King");

        book[3] = new Book(48217, "It", "Horror", false, "James Carter");


        book[4] = new Book(59103, "Pet Sematary", "Horror", true, "Olivia Bennett");

        book[5] = new Book(62784, "Carrie", "Horror", true, "Daniel Brooks");

        book[6] = new Book(71395, "Salem's Lot", "Horror", false, "Emily Parker");

        book[7] = new Book(84621, "Misery", "Horror", true, "Lucas Mitchell");

        book[8] = new Book(95238, "The Exorcist", "Horror", true, "Sophia Turner");

        book[9] = new Book(16743, "Rosemary's Baby", "Horror", false, "Ethan Collins");


        book[10] = new Book(28469, "The Haunting of Hill House", "Horror", true, "Ava Richardson");


        book[11] = new Book(39651, "Hell House", "Horror", true, "Noah Foster");

        book[12] = new Book(41582, "Bird Box", "Horror", false, "Mia Reynolds");

        book[13] = new Book(52876, "House of Leaves", "Horror", true, "Caleb Morgan");


        book[14] = new Book(63914, "Mexican Gothic", "Horror", true, "Isabella Hayes");

        book[15] = new Book(74268, "The Woman in Black", "Horror", false, "Mason Cooper");


        book[16] = new Book(85317, "Interview with the Vampire", "Horror", true, "Chloe Sanders");


        book[17] = new Book(96425, "Ghost Story", "Horror", true, "Logan Price");


        book[18] = new Book(17539, "The Turn of the Screw", "Horror", false, "Grace Peterson");


        book[19] = new Book(28641, "Coraline", "Horror", true, "Owen Phillips");


            System.out.println("System Processing... ");
            Thread.sleep(1000);

            System.out.println(".");
            Thread.sleep(500);

            System.out.println(".");
            Thread.sleep(700);

            System.out.println(".");
            Thread.sleep(3000);

            System.out.println("System Print Complete :)");
            Thread.sleep(1500);

            System.out.println("Hello!");
            Thread.sleep(1200);

        System.out.println("Welcome to the K.A.T Library");
            Thread.sleep(1500);

            System.out.println("Before we get started");
            Thread.sleep(2000);

            System.out.println("Choose from our list bellow");
            Thread.sleep(2000);

            System.out.println("1. View Available Categories ");
            Thread.sleep(800);

            System.out.println("2. Show Checked out Books ");
            Thread.sleep(800);

            System.out.println("3. Close Application");
            Thread.sleep(800);

            number = scanner.nextInt();
            scanner.nextLine();

        switch(number){

                case 1:
                        System.out.println("You chose! :" + " View Available Books ");
                        Thread.sleep(1500);

                        System.out.println("Here's a list of our Available Books");
                        Thread.sleep(1500);

                    System.out.println(book[0]); Thread.sleep(500);

                    System.out.println(book[1]); Thread.sleep(500);

                    System.out.println(book[2]); Thread.sleep(500);

                    System.out.println(book[3]); Thread.sleep(500);

                    System.out.println(book[4]); Thread.sleep(500);

                    System.out.println(book[5]); Thread.sleep(500);

                    System.out.println(book[6]); Thread.sleep(500);

                    System.out.println(book[7]); Thread.sleep(500);

                    System.out.println(book[8]); Thread.sleep(500);

                    System.out.println(book[9]); Thread.sleep(500);

                    System.out.println(book[10]); Thread.sleep(500);

                    System.out.println(book[11]); Thread.sleep(500);

                    System.out.println(book[12]); Thread.sleep(500);

                    System.out.println(book[13]); Thread.sleep(500);

                    System.out.println(book[14]); Thread.sleep(500);

                    System.out.println(book[15]); Thread.sleep(500);

                    System.out.println(book[16]); Thread.sleep(500);

                    System.out.println(book[17]); Thread.sleep(500);

                    System.out.println(book[18]); Thread.sleep(500);

                    System.out.println(book[19]); Thread.sleep(500);


                        break;
                case 2:
                        System.out.println("You chose! " + " Show Checked out Books ");


                        break;
                case 3:
                        System.out.println("You chose!" + "To close Application");
                        break;


            default: {
                    System.out.println("Invalid choice" + "Try Again");
                    break;
            }
        }


    }
}