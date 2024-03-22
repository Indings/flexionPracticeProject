package com.example.flexionPraciceProject.unit;

import com.example.utils.InputValidationUtils;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class InputValidationUnitTests {
    InputValidationUtils inputValidationUtils = new InputValidationUtils();
    Scanner yScanner = new Scanner("y");
    Scanner nScanner = new Scanner("n");
    Scanner neitherScanner = new Scanner("audeze\ny");
    Scanner validSideLengths = new Scanner("3 4 5");
    Scanner invalidSideLengths = new Scanner("10 42 focal");

    @Test
    void test_User_Entered_Y(){
        assertTrue(inputValidationUtils.validateUserChoice(yScanner));
    }
    @Test
    void test_User_Entered_N(){
        assertFalse(inputValidationUtils.validateUserChoice(nScanner));
    }
    @Test
    void test_User_Entered_Neither_Y_Or_N(){
        //referenced https://stackoverflow.com/questions/32241057/how-to-test-a-print-method-in-java-using-junit
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        inputValidationUtils.validateUserChoice(neitherScanner);
        String expectedOutcome = "please enter \"y\" or \"n\"\nwould you like to identify a triangle? (y/n)\n";
        assertEquals(expectedOutcome,outContent.toString());
    }
    @Test
    void test_User_Entered_Valid_Side_Lengths(){
        float[] valid = new float[]{3,4,5};
        assertArrayEquals(valid,inputValidationUtils.validateSideLengths(validSideLengths));
    }
    @Test
    void test_User_Entered_Invalid_Side_Lengths(){
        assertArrayEquals(null,inputValidationUtils.validateSideLengths(invalidSideLengths));
    }

}
