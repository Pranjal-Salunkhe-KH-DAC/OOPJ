//Q15:  Implement a program to swap  odd and even bits  of a number using bitwise operators. 
//Hint  : Use masks:  (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1

import java.util.Scanner;

public class Q15 {
    
    int swapOddEvenBits(int x) {
        int evenBits = x & 0xAAAAAAAA; // Mask to extract even bits (10101010... in binary)
        int oddBits = x & 0x55555555;  // Mask to extract odd bits  (01010101... in binary)
        
        evenBits >>= 1; // Shift even bits right
        oddBits <<= 1;  // Shift odd bits left

        return (evenBits | oddBits); // Combine the swapped bits
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        Q15 obj = new Q15();
        int result = obj.swapOddEvenBits(num);

        System.out.println("Number after swapping odd and even bits: " + result);

        scanner.close();
    }
}
