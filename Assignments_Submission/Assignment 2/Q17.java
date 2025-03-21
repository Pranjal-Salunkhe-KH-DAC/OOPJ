//Q17:  Implement a Java program that finds the  minimum of four numbers  using nested ternary operators.

import java.util.Scanner;

public class Q17 {
    int findMinimum(int a, int b, int c, int d) {
        return (a < b) ? ((a < c) ? ((a < d) ? a : d) : (c < d ? c : d)) 
                       : ((b < c) ? ((b < d) ? b : d) : (c < d ? c : d));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        Q17 obj = new Q17();
        int min = obj.findMinimum(num1, num2, num3, num4);

        System.out.println("The minimum number is: " + min);

        scanner.close();
    }
}
