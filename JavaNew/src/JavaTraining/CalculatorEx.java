package JavaTraining;

import java.util.Scanner;

public class CalculatorEx {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Simple Calculator");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");

	        System.out.print("Enter your choice (1-4): ");
	        int choice = scanner.nextInt();

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        double result = 0;

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                break;
	            case 2:
	                result = num1 - num2;
	                break;
	            case 3:
	                result = num1 * num2;
	                break;
	            case 4:
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error: Cannot divide by zero");
	                    System.exit(0);
	                }
	                break;
	            default:
	                System.out.println("Invalid choice");
	                System.exit(0);
	        }

	        System.out.println("Result: " + result);

	        scanner.close();
	    }
	}

