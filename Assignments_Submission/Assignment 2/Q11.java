//Q11:  Write a program to check if a given number is a  power of 2  using bitwise operators. 
//Hint  :  n & (n - 1) == 0  for positive numbers. 
import java.util.Scanner;

public class Q11 {
    // Function to check if a number is a power of 2 using bitwise operators
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    //Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is not a power of 2.");
        }
        
       
    }
}
