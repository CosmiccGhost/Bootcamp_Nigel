package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String menuLetter;

    public static void main(String[] args) throws InterruptedException {
int number = 0;
Scanner scanner = new Scanner(System.in);


        Book[] book =  new Book[20];


        book[0] = new Book(10456, "Dracula", "Horror", false, "Bram Stoker");


        book[1] = new Book(23891, "Frankenstein", "Horror", false, "Mary Shelley");


        book[2] = new Book(37542, "The Shining", "Horror", false, "Stephen King");


        book[3] = new Book(48217, "It", "Horror", false, "James Carter");


        book[4] = new Book(59103, "Pet Sematary", "Horror", false, "Olivia Bennett");


        book[5] = new Book(62784, "Carrie", "Horror", false, "Daniel Brooks");


        book[6] = new Book(71395, "Salem's Lot", "Horror", false, "Emily Parker");


        book[7] = new Book(84621, "Misery", "Horror", false, "Lucas Mitchell");


        book[8] = new Book(95238, "The Exorcist", "Horror", false, "Sophia Turner");


        book[9] = new Book(16743, "Rosemary's Baby", "Horror", false, "Ethan Collins");


        book[10] = new Book(28469, "The Haunting of Hill House", "Horror", false, "Ava Richardson");


        book[11] = new Book(39651, "Hell House", "Horror", true, "Noah Foster");


        book[12] = new Book(41582, "Bird Box", "Horror", true, "Mia Reynolds");


        book[13] = new Book(52876, "House of Leaves", "Horror", true, "Caleb Morgan");


        book[14] = new Book(63914, "Mexican Gothic", "Horror", true, "Isabella Hayes");


        book[15] = new Book(74268, "The Woman in Black", "Horror", true, "Mason Cooper");


        book[16] = new Book(85317, "Interview with the Vampire", "Horror", true, "Chloe Sanders");


        book[17] = new Book(96425, "Ghost Story", "Horror", true, "Logan Price");


        book[18] = new Book(17539, "The Turn of the Screw", "Horror", true, "Grace Peterson");


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


while(true){
    System.out.println("1. View Available Categories ");
    Thread.sleep(800);

    System.out.println("2. Show Checked out Books ");
    Thread.sleep(800);

    System.out.println("3. Close Application");
    Thread.sleep(800);


    number = scanner.nextInt();
    scanner.nextLine();

        switch(number) {

                case 1:

                        System.out.println("You chose! :" + " View Available Books ");
                        Thread.sleep(1500);

                        System.out.println("Here's a list of our Available Books");
                        Thread.sleep(1500);

                    System.out.println(); Thread.sleep(500);

                    System.out.println(); Thread.sleep(500);

                    System.out.println(book[0]); Thread.sleep(500);

                    System.out.println(book[1] ); Thread.sleep(500);

                    System.out.println(book[2]); Thread.sleep(500);

                    System.out.println(book[3]); Thread.sleep(500);

                    System.out.println(book[4]); Thread.sleep(500);

                    System.out.println(book[5]); Thread.sleep(500);

                    System.out.println(book[6]); Thread.sleep(500);

                    System.out.println(book[7]); Thread.sleep(500);

                    System.out.println(book[8]); Thread.sleep(500);

                    System.out.println(book[9]); Thread.sleep(500);

                    System.out.println(book[10]); Thread.sleep(500);

                    System.out.println("Would you like to check out one of the available books?");

                    String answer = scanner.nextLine();

                    if(answer.equalsIgnoreCase("Yes"))

                        System.out.println("Great!");Thread.sleep(500);
                    System.out.println("Which book would you like to checkout");Thread.sleep(500);

                    System.out.println("Dracula");
                    System.out.println("Frankenstein");
                    System.out.println("The Shining");
                    System.out.println("It");
                    System.out.println("Pet Sematary");
                    System.out.println("Carrie");
                    System.out.println("Salem's Lot");
                    System.out.println("Misery");
                    System.out.println("The Exorcist");
                    System.out.println("Rosemary's Baby");
                    System.out.println("The Haunting of Hill House");

                    String checkedOutBook = scanner.nextLine();

                    if(checkedOutBook.equalsIgnoreCase("Dracula"));
                    else if(checkedOutBook.equalsIgnoreCase("Frankenstein"));
                    else if(checkedOutBook.equalsIgnoreCase("The Shining"));
                    else if(checkedOutBook.equalsIgnoreCase("It"));
                    else if(checkedOutBook.equalsIgnoreCase("Pet Sematary"));
                    else if(checkedOutBook.equalsIgnoreCase("Carrie"));
                    else if(checkedOutBook.equalsIgnoreCase("Salem's Lot"));
                    else if(checkedOutBook.equalsIgnoreCase("Misery"));
                    else if(checkedOutBook.equalsIgnoreCase("The Exorcist"));
                    else if(checkedOutBook.equalsIgnoreCase("Rosemary's Baby"));
                    else if(checkedOutBook.equalsIgnoreCase("The Haunting of Hill House"));

     System.out.println("You chose " + checkedOutBook);

    System.out.println("Type C to check out your book " + checkedOutBook);

    String letter = scanner.nextLine();

    if (letter.equalsIgnoreCase("C"))



        System.out.println("You've checked out " + checkedOutBook);
                    System.out.println("Press X to return to menu");
                    
if (letter.equalsIgnoreCase("X"))

    System.out.println("Returning to menu"); Thread.sleep(2000);

    letter = scanner.nextLine();

    
    


                    break;
                case 2:
                        System.out.println("You chose! " + " Show Checked out Books ");

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
                case 3:
                        System.out.println("You chose! " + " To close Application");
                        System.exit(0);
                        break;


            default: {
                System.out.println("Invalid choice " + " Try Again");
                break;
            }
            }
        }


    }
}