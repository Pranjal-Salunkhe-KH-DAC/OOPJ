//Q2:  Write a program to check whether a given number is  even or odd  using only  bitwise operators  . 
//Hint  : Use  n & 1  to check.
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt(); 
		

        if ((n & 1) == 0) {
            System.out.println(n + " is an even number.");
        } else {
            System.out.println(n + " is an odd number.");
        }
    }
}
