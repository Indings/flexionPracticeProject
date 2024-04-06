package com.example.flexionPraciceProject.unit;

import com.example.utils.InputValidationUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class InputValidationUnitTests {
    InputValidationUtils inputValidationUtils = new InputValidationUtils();
    String yString = "y";
    String nString = "n";
    String neitherString = "audeze\ny";
    float[] valid = new float[]{3,4,5};
    String validSideA = "3"; String validSideB = "4.0"; String validSideC = "5";
    String invalidSideA = "10"; String invalidSideB = "42"; String invalidSideC = "focal";

    @Test
    void test_User_Entered_Y(){
        assertEquals("y entered - proceed",inputValidationUtils.validateUserChoice(yString));
    }
    @Test
    void test_User_Entered_N(){
        assertEquals("n entered - exit", inputValidationUtils.validateUserChoice(nString));
    }
    @Test
    void test_User_Entered_Neither_Y_Or_N(){
        assertEquals ("invalid", inputValidationUtils.validateUserChoice(neitherString));
    }
    @Test
    void test_User_Entered_Valid_Side_Lengths(){
        assertArrayEquals(valid,inputValidationUtils.validateSideLengths(validSideA,validSideB,validSideC));
    }
    @Test
    void test_User_Entered_Invalid_Side_Lengths(){
        assertArrayEquals(null,inputValidationUtils.validateSideLengths(invalidSideA,invalidSideB,invalidSideC));
    }

}
