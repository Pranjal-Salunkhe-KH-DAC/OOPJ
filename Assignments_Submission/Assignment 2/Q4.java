//4:  Write a program to find whether a given number is  divisible by 3  without using the modulus (  %  ) or division (  /  ) operators. 
//Hint  : Use  subtraction and bitwise shifts. 

import java.util.Scanner;

public class Q4{

    public static boolean isDivisibleBy3(int n) {
        if (n < 0) {
            n = -n;
        }
        if (n == 0) {
            return true;
        }
        if (n < 3) {
            return false;
        }

        int sum = 0;
        while (n > 0) {
            sum += n - (n / 10) * 10;
            n = n / 10;
        }

        while (sum >= 3) {
            sum -= 3;
        }
        return sum == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isDivisibleBy3(num)) {
            System.out.println(num + " is divisible by 3");
        } else {
            System.out.println(num + " is not divisible by 3");
        }
    }
}