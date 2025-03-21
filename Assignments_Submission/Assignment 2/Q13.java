//Q13:  Implement a Java program to find the  absolute value  of an integer using bitwise operators. 
//Hint  :  mask = num >> 31; abs = (num + mask) ^ mask;

import java.util.Scanner;

public class Q13 {
    
    int absoluteValue(int num) {
        int mask = num >> 31; // Extracts the sign bit (0 for positive, -1 for negative)
        return (num + mask) ^ mask; // Converts negative to positive, keeps positive unchanged
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        
        Q13 obj = new Q13();
        int absValue = obj.absoluteValue(num);

        System.out.println("Absolute value of " + num + " is: " + absValue);

        
    }
}
