//Q23:  Given a number, find whether it is  odd or even  using the  &  bitwise operator and print the result without using  if-else 

import java.util.Scanner;

public class Q23 {
    
    String checkOddEven(int num) {
        return (num & 1) == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

       
        Q23 obj = new Q23();
        System.out.println("The number is: " + obj.checkOddEven(num));

        scanner.close();
    }
}
