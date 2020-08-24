package com.aguero.aprender;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Intro("Jarvis", "2018");
        Username();
        guessAge();
        guessNumber();
        question();
    }
     static void Intro(String name, String year){
         System.out.println("Hello! My name is ." + name);
         System.out.println("I was created in ." + year);
         System.out.println("Please, remind me your name.");
    }
    static void Username(){
        System.out.print("Enter name >>> ");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
    static void guessAge(){
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7");

        System.out.print(">");
        int remainder3 = scanner.nextInt() ;

        System.out.print(">");
        int remainder5 = scanner.nextInt();

        System.out.print(">");
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7  * 15) % 105;

        System.out.println("Your age is " + age + " ; that's a good age to start programming! ");
    }
    static void guessNumber(){
        System.out.println("Now I will prove to you I can count to any number you want");

        System.out.print(">");
        int numbers = scanner.nextInt();

        if (numbers > 0) {
            for (int i = 0; i <= numbers; i++)
                System.out.println(i + "!");
            System.out.println("Completed, have a nice day!");
        }
    }
    static void question(){
        System.out.println("Why do we use methods?");

        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");


        System.out.print(">");
        int input = scanner.nextInt();
        while(input != 2) {
            System.out.println("Sorry not correct Please Try again ");
            System.out.print(">");
            input = scanner.nextInt();

        }
        System.out.println("Completed, have a nice day!");
    }
}
