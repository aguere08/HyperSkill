package com.aguero.aprender;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine().substring(0,1);
        System.out.println(word1.equalsIgnoreCase("J"));


    }
}

//    the scanner and string are good. Next lets move on to what I think you are missing here.
//    convert the str variable into a lower or upper case to all characters be the same.
//    create a boolean variable and assign startsWith("something");
//    remember that "something in the example given is in lower case so that is a hint given by the instructions.
//    print the boolean return value.


//    String word1 = scanner.nextLine();
//    word1 = word1.toUpperCase();
//    boolean a = word1.startsWith("J");
//    System.out.println(a);