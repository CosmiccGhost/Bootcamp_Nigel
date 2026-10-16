package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my F.F Calculator");
        System.out.println("Could I Get a name");

        String name = scanner.nextLine();

        System.out.println("Nice name");
        System.out.println("Now could I get an age");

        int age = scanner.nextInt();

        System.out.println("Great");

        System.out.println("Now let's get a little more details.");

    }
}