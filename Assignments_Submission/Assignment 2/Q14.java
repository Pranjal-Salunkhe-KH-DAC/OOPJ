//Q14:  Write a program to count the  number of 1s (set bits)  in a binary representation of a number using bitwise operations. 
//Hint  : Use  n & (n - 1) 
import java.util.Scanner;

public class Q14 {
    
    int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1); // Clears the rightmost set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        Q14 obj = new Q14();
        int result = obj.countSetBits(num);

        System.out.println("Number of 1s (set bits) in " + num + " is: " + result);

        scanner.close();
    }
}
