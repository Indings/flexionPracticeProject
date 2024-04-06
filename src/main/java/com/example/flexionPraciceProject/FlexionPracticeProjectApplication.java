package com.example.flexionPraciceProject;

import com.example.service.TriangleAnalysis;
import com.example.utils.InputValidationUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FlexionPracticeProjectApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		InputValidationUtils inputValidationUtils = new InputValidationUtils();
		float[] sideLengths;

		SpringApplication.run(FlexionPracticeProjectApplication.class, args);

		while(true) {
			System.out.println("would you like to identify a triangle? (y/n)");
			String input = scanner.nextLine();
			if(inputValidationUtils.validateUserChoice(input).equals("n entered - exit")){
				System.out.println("Successfully exited");
				break;
			} else if (inputValidationUtils.validateUserChoice(input).equals("invalid")) {
				System.out.println("please enter \"y\" or \"n\"");
				continue;
			}

			System.out.println("Enter the 3 side lengths of your triangle: ");
			String a = scanner.next(); String b = scanner.next(); String c = scanner.next();
			sideLengths = inputValidationUtils.validateSideLengths(a,b,c);
			if (sideLengths == null){
				System.err.println("Please enter an valid float");
				scanner.nextLine();
				continue;
			}

			TriangleAnalysis triangleAnalysis = new TriangleAnalysis();
			System.out.println(triangleAnalysis.identifyTriangle(sideLengths));
			scanner.nextLine();
		}

	}

}
