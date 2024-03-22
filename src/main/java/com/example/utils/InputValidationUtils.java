package com.example.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidationUtils {

    public boolean validateUserChoice (Scanner scanner){
       while (true) {
           String input = scanner.nextLine();
           if (input.equals("n")) {
               System.out.println("Successfully exited");
               return false;
           } else if (!input.equals("y")) {
               System.out.println("please enter \"y\" or \"n\"");
               System.out.println("would you like to identify a triangle? (y/n)");

               continue;
           }
           return true;
       }
    }

    public float[] validateSideLengths(Scanner scanner){
        try {
            return new float[]{scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat()};
        } catch (InputMismatchException e) {
            System.err.println("Please enter an valid float: " + e);
            scanner.nextLine();
            return null;
        }
    }
}
