package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int number = 0;
Scanner scanner = new Scanner(System.in);



        String[] book =  new String[20];
            book[0] = "Dracula";
            book[1] = "Frankenstein";
            book[2] = "The Shining";
            book[3] = "It";
            book[4] = "Pet Sematary";
            book[5] = "Carrie";
            book[6] = "Salem's Lot";
            book[7] = "Misery";
            book[8] = "The Exorcist";
            book[9] = "Rosemary's Baby";
            book[10] = "The Haunting of Hill House";
            book[11] = "Hell House";
            book[12] = "Bird Box";
            book[13] = "House of Leaves";
            book[14] = "Mexican Gothic";
            book[15] = "The Woman in Black";
            book[16] = "Interview with the Vampire";
            book[17] = "Ghost Story";
            book[18] = "The Turn of the Screw";
            book[19] = "Coraline";

        System.out.println("Welcome to the K.A.T Library");
            System.out.println("Before we get started");
            System.out.println("Choose from our list bellow");
            System.out.println("1. View Available Categories ");
            System.out.println("2. Show Checked out Books ");
            System.out.println("3. Close Application");
            number = scanner.nextInt();
        switch(number){

                case 1:
                        System.out.println("You chose! :" + " View Available Books ");


                        System.out.println("Here's a list of our Available Books");

                        System.out.println("1. Dracula");
                        System.out.println("2. Frankenstein");
                        System.out.println("3. The Shining");
                        System.out.println("4. It");
                        System.out.println("5. Pet Sematary");
                        System.out.println("6. Carrie");
                        System.out.println("7. Salem's Lot");
                        System.out.println("8. Misery");
                        System.out.println("9. The Exorcist");
                        System.out.println("10. Rosemary's Baby");
                        System.out.println("11. The Haunting of Hill House");
                        System.out.println("12. Hell House");
                        System.out.println("13. Bird Box");
                        System.out.println("14. House of Leaves");
                        System.out.println("15. Mexican Gothic");
                        System.out.println("16. The Woman in Black");
                        System.out.println("17. Interview with the Vampire");
                        System.out.println("18. Ghost Story");
                        System.out.println("19. The Turn of the Screw");
                        System.out.println("20. Coraline");


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