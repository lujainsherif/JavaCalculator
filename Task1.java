package task1;

import java.util.Scanner;

public class Task1 {
	
	   static double add(double num1, double num2) {
		   return num1 + num2; 
		}
	
	   static double subtract(double num1, double num2) {
		   return num1 - num2; 
		}
	   
	   static double multiply(double num1, double num2) {
		   return num1* num2; 
		}
	   
	   
	   static double divide(double num1, double num2) {
		    if (num2 == 0) {
		        throw new ArithmeticException("Cannot divide by zero");
		    }
		    return num1 / num2;
		}
	
		
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter first number:");
		double num1 =input.nextDouble();
		
		System.out.print("Enter second number:");
		double num2 =input.nextDouble();
		
		input.nextLine();
		
		System.out.print("Enter the operation (+ , - , * , /):");
		char op =input.nextLine().charAt(0);
		
		try {
            double result;
            switch (op) {
                case '+': 
                	result = add(num1, num2); 
                	break;
                	
                case '-': 
                	result = subtract(num1, num2); 
                	break;
                	
                case '*': 
                	result = multiply(num1, num2); 
                	break;
                	
                case '/': 
                	result = divide(num1, num2);
                	break;
                	
                default:
                    System.out.println("Invalid operation.");               
                    return;
            }
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error! " + ex.getMessage());
        }

       
    }
}
