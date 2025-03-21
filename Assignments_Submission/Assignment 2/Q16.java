//Q16:  Write a program that determines whether a given number is  positive, negative, or zero  using only the  ternary operator 

import java.util.Scanner;

public class Q16 {
    
    String checkNumber(int num) {
        return (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        Q16 obj = new Q16();
        String result = obj.checkNumber(num);

        System.out.println("The number is: " + result);

        scanner.close();
    }
}
