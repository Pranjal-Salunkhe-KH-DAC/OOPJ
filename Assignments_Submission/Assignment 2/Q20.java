//Q20:  Implement a Java program that  returns the absolute value  of a given number using the ternary operator (without using  Math.abs() 
import java.util.Scanner;

public class Q20 {
   
    int absoluteValue(int num) {
        return (num < 0) ? -num : num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

       
        Q20 obj = new Q20();
        int absValue = obj.absoluteValue(num);

        System.out.println("Absolute value: " + absValue);

        scanner.close();
    }
}
