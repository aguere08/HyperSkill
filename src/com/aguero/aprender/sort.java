package com.aguero.aprender;

import java.util.Scanner;

public class sort {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        }
    static void  test(){
        String[] questions = new String[5];

        System.out.println("Why do we use methods?");

        questions[1] = "1. To repeat a statement multiple times.";
        questions[2] = "2. To decompose a program into several small subroutines.";
        questions[3] = "3. To determine the execution time of a program.";
        questions[4] = "4. To interrupt the execution of a program.";

        System.out.println(questions[1]);
        System.out.println(questions[2]);
        System.out.println(questions[3]);
        System.out.println(questions[4]);

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





