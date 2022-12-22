package com.linkedin.javacodechallenges;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App {


    public static boolean isPasswordComplex(String password) {
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasNumber = false;

        // can do it much quicker this way
        // return password.length() >= 6 &&
        // password.matches(".*\\d.*") &&
        // password.matches(".*[a-z].*") &&
        // password.matches(".*[A-Z].*");

        String regex = "[A-Za-z0-9]";
       
        if ((password.length() < 6) ) {
            return false;
        } 

        for (int i = 0; i < password.length() || !hasLowercase 
        && !hasUppercase && !hasNumber; i++) {
            char current = password.charAt(i);
            if(Character.isDigit(current)) {
                hasNumber = true;
            } else if (Character.isUpperCase(current)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(current)) {
                hasLowercase = true;
            }
        }

        return hasNumber && hasLowercase && hasUppercase;
    
    }

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Enter a password: ");
       String userInput = scanner.nextLine();
       System.out.println("Is the password complex? " + isPasswordComplex(userInput));

       scanner.close();
    }
}
