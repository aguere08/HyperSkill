package com.aguero.aprender;

import java.util.Scanner;
import java.math.*;

public class sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter)? "YES": "NO");
    }

    public static boolean isVowel(char ch){
        String vowels = "aAeEiIoOuU";
        return vowels.indexOf(vowels) == ch;
    }

}

