package com.example.utils;

public class InputValidationUtils {

    public String validateUserChoice (String input) {
            if (input.equals("n")) {
                return "n entered - exit";
            } else if (!input.equals("y")) {
                return "invalid";
            }
            return "y entered - proceed";
    }

    public float[] validateSideLengths(String a, String b, String c){
        try {
            return new float[]{Float.parseFloat(a), Float.parseFloat(b), Float.parseFloat(c)};
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
