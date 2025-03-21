//Q22:  Implement a  calculator  that takes two numbers and an operator (  +  ,  -  ,  *  ,  /  ) as input and prints the result using only  switch-case  . 

import java.util.Scanner;

public class Q22 {
    
    double calculate(double num1, double num2, int choice) {
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2; // Addition
                break;
            case 2:
                result = num1 - num2; // Subtraction
                break;
            case 3:
                result = num1 * num2; // Multiplication
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2; // Division
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN;
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter 1, 2, 3, or 4.");
                return Double.NaN;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        
        Q22 obj = new Q22();
        double result = obj.calculate(num1, num2, choice);

        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
