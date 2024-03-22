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
			if(!inputValidationUtils.validateUserChoice(scanner)){
				break;
			}

			System.out.println("Enter the 3 side lengths of your triangle: ");
			sideLengths = inputValidationUtils.validateSideLengths(scanner);
			if (sideLengths == null){
				continue;
			}

			TriangleAnalysis triangleAnalysis = new TriangleAnalysis();
			System.out.println(triangleAnalysis.identifyTriangle(sideLengths));
			scanner.nextLine();
		}

	}

}
